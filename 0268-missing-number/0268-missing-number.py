class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        
        for i in range(len(nums)+1):
            print(i)
            if i in nums:
                pass
            else:
                return i
        return 0
            
        