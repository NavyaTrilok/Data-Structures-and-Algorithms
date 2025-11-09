class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        num = 0
        max_one = 0
        for x in nums:
            if x == 1:
                num += 1
                max_one = max(num, max_one)
            else:
                num = 0
        return max_one
        