class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums); 
      Map<Integer, Integer> numCounts = new HashMap<>();
      int n = nums.length;
      List<List<Integer>> res = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        int j = i + 1, k = n - 1;
        while (j < k) {
            if (nums[i] + nums[j] + nums[k] == 0 && !res.contains(List.of(nums[i], nums[j], nums[k]))) {res.add(List.of(nums[i], nums[j], nums[k]));
            j++; k--;}
            else if (nums[i] + nums[j] + nums[k] > 0) k--;
            else j++;
        }
      }
      return res;
    }
}
