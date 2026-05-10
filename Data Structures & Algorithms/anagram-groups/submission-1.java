class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> finalList = new ArrayList<>();
        for(String str : strs) {
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray); 
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
            // if(anagramMap.containsKey(sortedStr)) {
            //     List<String> anagramList = anagramMap.get(sortedStr);
            //     anagramList.add(str);
            //     anagramMap.put(sortedStr, anagramList);
            // } else {
            //     List<String> anagramList = new ArrayList<>();
            //     anagramList.add(str);
            //     anagramMap.put(sortedStr, anagramList);
            // }
        }
        for(List<String> anagramList : anagramMap.values()){
            finalList.add(anagramList); 
        }
    return finalList;
    }
}
