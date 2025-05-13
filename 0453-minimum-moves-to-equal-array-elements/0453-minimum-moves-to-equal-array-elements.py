class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        min_number = min(nums)
        total = 0

        for x in nums:
            total = total + (x - min_number)

        return total
        