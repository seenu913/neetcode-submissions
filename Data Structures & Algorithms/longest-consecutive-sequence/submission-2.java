class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) return 0;
    Arrays.sort(nums);

    int maxLen = 1, curr = 1;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i-1]) continue;       // skip duplicates
        if (nums[i] == nums[i-1] + 1) curr++;      // consecutive → extend
        else curr = 1;                             // gap → reset
        maxLen = Math.max(maxLen, curr);
    }
    return maxLen;
    }
}
