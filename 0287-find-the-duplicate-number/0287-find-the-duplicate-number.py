class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map = {}

        for i in range(len(nums)):
            if nums[i] in map:
                map[nums[i]] =  map[nums[i]] + 1
            else:
                map[nums[i]] = 1

        for key in map:
            if map[key] > 1:
                return key
        
        
        