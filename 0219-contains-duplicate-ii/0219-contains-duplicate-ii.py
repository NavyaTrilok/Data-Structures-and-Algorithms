class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        """"
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i] == nums[j] and abs(i - j) <= k and i!=j:
                    return True
        return False
        
        This solution gives TLE
        """
        
        
        index_map = {}
        for i, num in enumerate(nums):
            if num in index_map and abs(i - index_map[num]) <= k:
                return True
            index_map[num] = i
        return False
