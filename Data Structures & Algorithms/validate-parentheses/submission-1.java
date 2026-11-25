class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('}', '{', ']', '[', ')', '(');
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (stack.size() == 0 || stack.peekLast() != map.get(ch)) {
                    return false;
                } else {
                    stack.pollLast();
                }
            } else {
                stack.addLast(ch);
            }
        }
        return stack.size() == 0;
    }
}
