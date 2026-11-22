class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        int i = 1;
        // if i[1] < i+1[0] and i+2[0] > i+1[1]
        // append i[0],i + 2[1]
        while (i < intervals.length) {
            if (res.get(res.size() - 1)[1] >= intervals[i][0]) {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
            }
            i++;
        }
        return 	res.toArray(new int[res.size()][]);
    }
}
