class Solution(object):
    def areOccurrencesEqual(self, s):
        return len(set(Counter(s).values())) == 1
        