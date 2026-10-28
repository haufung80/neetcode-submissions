class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums) {
            int c = count.getOrDefault(num, 0) + 1;
            count.put(num, c);
            if(c > nums.length / 2) { return num;}
        }
        return 0;
    }
}