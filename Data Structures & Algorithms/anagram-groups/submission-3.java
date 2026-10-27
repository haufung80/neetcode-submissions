class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> groups = new HashMap<>();
        for (String str: strs) {
            Map<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
            }
            groups.computeIfAbsent(hm, k -> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(groups.values());
    }
}
