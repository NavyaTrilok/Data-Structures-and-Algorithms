class Solution(object):
    def finalString(self, s):
        str = ""
        for char in s:
            if char == 'i':
                str = str[::-1]
            else:
                str+=char
        return str
                
        