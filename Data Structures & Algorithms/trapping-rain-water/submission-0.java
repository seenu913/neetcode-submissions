class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0;
        int r = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= leftMax) {
                    leftMax = height[l]; // Update left max
                } else {
                    total += leftMax - height[l]; // Water trapped above current bar
                }
                l++;
            } else {
                if (height[r] >= rightMax) {
                    rightMax = height[r]; // Update right max
                } else {
                    total += rightMax - height[r]; // Water trapped above current bar
                }
                r--;
            }
        }

        return total;
    }
}