class Solution(object):
    def validPalindrome(self, s):
        i = 0
        j = len(s) - 1
        while i < j:
            if s[i] == s[j]:
                i+=1
                j-=1
            else:
                return self.ispalindrome(s, i+1, j) or self.ispalindrome(s, i, j-1)
        return True
    
    def ispalindrome(self, s, i , j):
        while i < j:
            if s[i] == s[j]:
                i+=1
                j-=1
            else:
                return False
        return True
        