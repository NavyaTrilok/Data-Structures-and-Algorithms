class Solution(object):
    def restoreString(self, s, indices):
        str = [''] *len(s)
        for i in range(len(s)):
            str[indices[i]] = s[i]
        
        return ''.join(i for i in str)
    
    
    
    
            