class Solution(object):
    def containsDuplicate(self, nums):

        c = Counter(nums)

        for count in c.values():
            if count > 1:
                return True
        
        return False
        