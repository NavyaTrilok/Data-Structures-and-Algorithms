class Solution(object):
    def minimizedStringLength(self, s):
        str = set()
        for char in s:
            str.add(char)
        return len(str)
            
        