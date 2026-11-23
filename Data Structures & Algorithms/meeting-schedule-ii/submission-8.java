/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        int res = 0;
        PriorityQueue<Integer> window = new PriorityQueue<>();
        for (int i = 0; i < intervals.size(); i++) {
            while (window.size() > 0 && intervals.get(i).start >= window.peek()) window.poll();
            if (window.size() == 0 || intervals.get(i).start < window.peek()) window.offer(intervals.get(i).end);
            res = Math.max(res, window.size());
        }
        return res;
    }
}
