class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> finalList = new ArrayList<>();
        for(String str : strs) {
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray); 
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        for(List<String> anagramList : anagramMap.values()){
            finalList.add(anagramList); 
        }
    return finalList;
    }
}
