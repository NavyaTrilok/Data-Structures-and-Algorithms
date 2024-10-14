class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        
        a = set(nums1)
        
        ans = set()
        
        for i in range(len(nums2)):
            if nums2[i] in a:
                ans.add(nums2[i])
                
        return ans
            
        
            
        