from collections import Counter
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        c = Counter(nums)
        for i in c.values():
            if i > 1:
                return True
        return False

        