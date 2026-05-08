class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        List<Integer> findDupeList = new ArrayList<>();
        for(int num : nums) {
            if(findDupeList.contains(num)) {
                return true;
            }
            findDupeList.add(num);
        }
    return false;
    }
}