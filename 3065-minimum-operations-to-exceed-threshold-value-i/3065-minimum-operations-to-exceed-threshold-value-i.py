class Solution(object):
    def minOperations(self, nums, k):
        lst = []
        count = 0
        for i in range(len(nums)):
            lst.append(nums[i])
        
        for i in range(len(lst)):
            if nums[i] < k:
                lst.remove(nums[i])
                count+=1
        return count
                
            
            
        