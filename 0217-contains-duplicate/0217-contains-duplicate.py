class Solution(object):
    def containsDuplicate(self, nums):
        a = set()
        for i in nums:
            if i not in a:
                a.add(i)
            else:
                return True
        return False
            
       