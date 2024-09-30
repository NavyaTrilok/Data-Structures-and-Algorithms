class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        low = 0
        high = len(nums)
        
        while low < high:
            m = (low + high) // 2;
            
            if nums[m] < target:
                low = m + 1
                
            else:
                high = m;
                
        return low
    """"
    low, high = 0, len(nums)
        while low < high:
            mid = (low + high) // 2
            if target > nums[mid]:
                low = mid + 1
            else:
                high = mid
        return low
    
      """          
        