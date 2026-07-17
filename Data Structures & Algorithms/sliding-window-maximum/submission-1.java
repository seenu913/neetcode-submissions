class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(k == 1) {
            return nums;
        }

        int left = 0;
        int[] outPut = new int[nums.length-k+1];
        for(int right = 0;right < nums.length-k+1 ; right++) {
            int max = 0;
            left=right;
            while(left < right+k) {
                max = Math.max(nums[left], max);
                left++;
            }
            outPut[right] = max;
        }
        return outPut;

    }
}
