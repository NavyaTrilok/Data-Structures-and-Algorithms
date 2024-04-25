class Solution(object):
    def minDeletionSize(self, strs):
        return len([s for s in zip(*strs) if list(s) != sorted(s)])

        