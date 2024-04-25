class Solution(object):
    def maximumValue(self, strs):
        return max(int(n) if n.isdigit() else len(n) for n in strs)
        