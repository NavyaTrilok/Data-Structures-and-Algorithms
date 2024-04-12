class Solution(object):
    def balancedStringSplit(self, s):
        res = 0;
        count = 0;
        
        for i in s:
            if i == 'L':
                count -= 1
            if i == 'R':
                count += 1
            if count == 0:
                res += 1
        return res
        
        