class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int n : nums) {
            if (!numSet.contains(n - 1)) {
                int length = 1;
                while (numSet.contains(n + 1)) {
                    length++;
                    n++;
                }
                longest = Math.max(longest, length);
            }
            
        }
        return longest;
    }
}
