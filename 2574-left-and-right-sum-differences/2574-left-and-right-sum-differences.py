class Solution(object):
    def leftRightDifference(self, nums):
        prefix = 0
        suffix = sum(nums)
        ans = []
        for x in nums:
            prefix += x
            ans.append(abs(prefix - suffix))
            suffix -= x
        return ans
        
        