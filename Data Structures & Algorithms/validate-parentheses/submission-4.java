class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1) {
            return false;
        }
        Deque stack = new ArrayDeque<>();
        Map<Character,Character> charMap = new HashMap<>();
        charMap.put(')','(');
        charMap.put('}','{');
        charMap.put(']','[');
        for(char c : s.toCharArray()) {
            if(charMap.containsKey(c)) {
                char ct = charMap.get(c);
                if(stack.isEmpty() || !stack.pop().equals(ct)) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
