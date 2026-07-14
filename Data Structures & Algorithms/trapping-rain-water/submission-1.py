class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        leftmax = 0
        rightmax = 0
        total = 0

        while l < r :
            if height[l] < height[r]:
                if height[l] >= leftmax:
                    leftmax = height[l]
                else :
                    total +=  leftmax - height[l]
                l += 1
            else :
                if height[r] >= rightmax :
                    rightmax = height[r]
                else :
                    total += rightmax - height[r]
                r -= 1
        return total