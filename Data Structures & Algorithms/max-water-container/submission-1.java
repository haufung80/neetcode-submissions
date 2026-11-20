class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int res = 0;
        while (i <= j) {
            int area = Math.min(height[i],height[j]) * (j - i);
            res = Math.max(area, res);
            if (i < n - 1 && height[j] > height[i]) i++;
            else j--;
        }
        return res;
    }
}