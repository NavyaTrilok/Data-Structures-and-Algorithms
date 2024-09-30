class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        
        index_map = {}
        
        for i, num in enumerate(nums):
            if num in index_map and abs(i - index_map[num]) <= k:
                return True
            index_map[num] = i
        return False
        