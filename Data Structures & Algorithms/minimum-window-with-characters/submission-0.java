class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        int left = 0;
        int missing = t.length();
        int bestLen = Integer.MAX_VALUE;
        int bestStart = 0;
        Map<Character, Integer> need = new HashMap<>();
        for(char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        for(int right = 0; right<s.length(); right++) {
            if(need.containsKey(s.charAt(right))) {
                if(need.get(s.charAt(right)) > 0) {
                    missing--;
                }
                need.put(s.charAt(right), need.get(s.charAt(right)) - 1);
            }

            while(missing == 0){
                if(right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestStart = left;
                }
                char leftChar = s.charAt(left);
                if(need.containsKey(leftChar)){
                    need.put(leftChar, need.get(leftChar) + 1);
                    if(need.get(leftChar) > 0) {
                        missing++;
                    }
                }
                left++;
            }
           
        }
    return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}
