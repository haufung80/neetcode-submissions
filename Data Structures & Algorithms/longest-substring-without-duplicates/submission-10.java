class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int i = 0, res = 1;
        Set<Character> window = new HashSet<>();
        window.add(s.charAt(0));
        for (int j = 1; j < n; j++) {
            while (window.contains(s.charAt(j))) {
                window.remove(s.charAt(i));
                i++;
            }
            window.add(s.charAt(j));
            res = Math.max(res, window.size());
            // System.out.println(window);
        }
        return res;
    }
}
