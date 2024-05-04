class Solution(object):
    def maxProductDifference(self, nums):
        lst = sorted(nums)
        print(nums)
        n = len(nums)
        return (lst[n-1]*lst[n-2]) - (lst[0]*lst[1])