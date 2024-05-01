class Solution(object):
    def buildArray(self, nums):
        ans = [None] * len(nums)
        for i in range(len(nums)):
            ans[i] = nums[nums[i]]
        return ans        