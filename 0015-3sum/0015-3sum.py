class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        set_ans = set()
        nums.sort()
        
        for i in range(len(nums)-2):
            left = i+1
            right = len(nums)-1
            
            while(left < right):
                sum = nums[i]+nums[left]+nums[right];
                if sum == 0:
                    set_ans.add((nums[i],nums[left],nums[right]))
                    left = left + 1
                    right = right - 1
                elif sum > 0:
                    right = right - 1
                    
                else:
                    left = left + 1
                    
        return list(set_ans);