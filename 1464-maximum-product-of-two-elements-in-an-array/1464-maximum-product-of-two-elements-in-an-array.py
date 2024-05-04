class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        arr = []
        for i in range(len(nums)):
            arr.append(nums[i])
            
        max1 = max(nums)
        arr.remove(max1)
        
        max2 = max(arr)
        
        
        return (max1-1)*(max2-1)
        
        
        