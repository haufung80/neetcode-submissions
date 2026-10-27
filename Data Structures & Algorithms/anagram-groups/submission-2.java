class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<Map<Character, Integer>> hmArr = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        for (String str: strs) {
            Map<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
            }
            if (!hmArr.contains(hm)) {
                hmArr.add(hm);
                result.add(new ArrayList<>(List.of(str)));
            } else {
                for (int i = 0; i < hmArr.size(); i++) {
                    if (hm.equals(hmArr.get(i))){
                        result.get(i).add(str);
                    }
                }
            }
        }
        return result;
    }
}
