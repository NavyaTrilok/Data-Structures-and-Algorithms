class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sum = 0
        for i in range(len(nums)):
            sum = sum + nums[i]

        lsum = 0
        rsum = sum

        for i in range(len(nums)):
            rsum = rsum - nums[i]

            if lsum == rsum:
                return i

            lsum = lsum + nums[i]

        return -1