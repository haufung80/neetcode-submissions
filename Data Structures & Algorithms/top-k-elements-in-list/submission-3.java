class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
         for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
         }
         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
         for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
            if (pq.size() > k) pq.remove();
         }
         return pq.stream().mapToInt(x -> x[1]).toArray();    }
}
