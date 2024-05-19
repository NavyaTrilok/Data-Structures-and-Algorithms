class Solution(object):
    def removeDuplicates(self, s):
        res = []
        ans = []
        for i in s:
            if res and res[-1] == i:
                res.pop()
            else:
                res.append(i)
                
        return "".join(res)
                
        
                
        
        