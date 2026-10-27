class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        Character curr;
        for (int i = 0; i < strs[0].length(); i++) {
            curr = strs[0].charAt(i);
            for (String str: strs) {
                if (i + 1 > str.length() || str.charAt(i) != curr) {
                    return sb.toString();
                }
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}