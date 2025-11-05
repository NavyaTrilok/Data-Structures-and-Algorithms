class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        map = {}
        result = []

        for i in range(len(nums)):
            if target-nums[i] in map:
                result.append(map[target-nums[i]])
                result.append(i)
            else:
                map[nums[i]] = i
            

        return result
        