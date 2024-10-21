class Solution(object):
    def repeatedSubstringPattern(self, s):
        """
        :type s: str
        :rtype: bool
        """
        for k in range(1, len(s)//2 +1):   
            if s == s[k:] + s[:k]:
                return True
        return False
        # if there is a k repeating pattern in s, then
        # we can tell that a k-rotation of s should be equal to s
        