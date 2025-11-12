from collections import Counter
class Solution:
    def maxDifference(self, s: str) -> int:
        
        c = Counter(s)
        max_odd = float('-inf')
        min_even = float('inf')
        odd = -1
        even = -1
        for i in c.values():
            if i%2 != 0:
                odd = i
                max_odd = max(odd,max_odd)
            else:
                even = i
                min_even = min(even, min_even)
        return max_odd - min_even
        