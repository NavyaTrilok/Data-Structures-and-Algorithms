class Solution(object):
    def largestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: str
        """
        
        if len(nums) == 1:
            return str(nums[0])
        
    
        temp = 0
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if int(str(nums[i])+str(nums[j])) < int(str(nums[j])+str(nums[i])):
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    j = j+1
                   
        
        strs = ""
        
        for i in range(len(nums)):
            strs = strs + str(nums[i])
            
        res = ''.join(strs)
        
        return str(int(res))
        
        