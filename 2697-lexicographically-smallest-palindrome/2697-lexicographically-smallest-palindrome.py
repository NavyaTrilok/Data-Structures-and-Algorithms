class Solution(object):
    def makeSmallestPalindrome(self, s):
        return ''.join(map(min, zip(s, s[::-1])))
        