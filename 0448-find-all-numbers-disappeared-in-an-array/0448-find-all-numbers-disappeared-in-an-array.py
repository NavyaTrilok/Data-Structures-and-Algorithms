class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        s = set()
        ans = set()
        
        nums.sort()
        
        for i in range(len(nums)):
            s.add(nums[i])
            
        for i in range(1,len(nums)+1):
            if i not in s:
                ans.add(i)
                
        return ans;
            
        
        