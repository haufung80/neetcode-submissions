class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[] {0,0,0};
        for (int i = 0; i < nums.length; i++){
            count[nums[i]] += 1;
        }
        int j = 0, i = 0;
        while (i < nums.length){
            if (count[j] > 0) {
                nums[i] = j;
                count[j] -= 1;
                i += 1;
            } else {
                j += 1;
            }
        }
        
    }
}