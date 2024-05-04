class Solution(object):
    def sumCounts(self, nums):
        ans = 0 
        for i in range(0,len(nums)):
            for j in range(i, len(nums)):
                ans += len(set(nums[i:j+1]))**2
        return ans
        