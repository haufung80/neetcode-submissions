class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int k = nums.length / 3;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num :nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        return count.entrySet().stream().filter(entry -> entry.getValue() > k).map(entry -> entry.getKey()).toList();
    }
}