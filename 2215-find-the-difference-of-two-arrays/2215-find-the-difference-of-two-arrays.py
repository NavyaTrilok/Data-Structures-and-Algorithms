class Solution(object):
    def findDifference(self, nums1, nums2):
        res = []
        a = []
        
        a = set(nums1) - set(nums2)
        
        b = []
        
        b = set(nums2) - set(nums1)
        
        res.append(a)
        res.append(b)
        
        return res
        