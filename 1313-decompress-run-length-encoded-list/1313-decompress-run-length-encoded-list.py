class Solution(object):
    def decompressRLElist(self, nums):
        arr = []
        for i in range(0,len(nums),2):
            for n in [nums[i+1]]*nums[i]:
                arr.append(n)
        return arr
        