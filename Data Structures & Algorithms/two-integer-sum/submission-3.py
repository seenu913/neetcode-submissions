class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # works for sorted postive number array
        # l = 0
        # r = len(nums) - 1
        # while l<r:
        #     count = nums[l] + nums[r]
        #     if count == target:
        #         return [l,r]
        #     elif count > target:
        #         r -= 1
        #     else:
        #         l += 1
        # return []

        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
        return []