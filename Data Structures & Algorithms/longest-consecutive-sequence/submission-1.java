class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int maxCount = 0;
        int currentMax = 1;
        while(i<nums.length){
            
            if(j<nums.length && nums[j]-nums[i] == currentMax) {
                currentMax = currentMax+1;
            }
            j++;
            if(j == nums.length) {
                j=i+1;
                i++;
                maxCount = Math.max(maxCount, currentMax);
                currentMax = 1;
            }

        }
        return maxCount;
    }
}
