class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        Integer max = Integer.MIN_VALUE;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> item: count.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
                maxKey = item.getKey();
            }
        }
        return maxKey;
    }
}