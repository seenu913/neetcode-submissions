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
            if(c =='(' || c =='{' || c =='[') {  
                stack.push(c);
            } else if ((c==')' || c=='}' || c==']') && 
               stack.size() > 0 && stack.pop().equals(charMap.get(c))) {
                continue;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
