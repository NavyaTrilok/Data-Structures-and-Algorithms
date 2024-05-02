class Solution(object):
    def runningSum(self, nums):
        res = []
        sum_so_far = 0
        for i in range(len(nums)):
            sum_so_far = 0
            for j in range(i+1):
                sum_so_far+=nums[j]
            res.append(sum_so_far)
        return res
        
        