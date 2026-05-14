class Solution {
    public int maxArea(int[] heights) {
        
        int maxCover = 0;
        int left = 0;
        int right = heights.length-1;
        
        while(left < right) {
            int currentMax = (right - left) * Math.min(heights[left],heights[right]);
            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
            maxCover = Math.max(maxCover, currentMax);
        }
        return maxCover;

    }
}
