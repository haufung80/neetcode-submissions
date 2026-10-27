class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str: strs) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            groups.computeIfAbsent(Arrays.toString(count), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
