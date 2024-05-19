class Solution(object):
    def removeDuplicates(self, s):
        res = []
        for c in s:
            if res and res[-1] == c:
                res.pop()
            else:
                res.append(c)
        return "".join(res)
        