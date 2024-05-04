class Solution(object):
    def differenceOfSum(self, nums):
        dig_sum = 0
        for i in nums:
            for j in str(i):
                dig_sum += int(j)
        
        return sum(nums) - dig_sum

             
        
        