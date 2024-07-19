class Solution(object):
    def separateDigits(self, nums):
        StringList = map(str, nums)
        string = ''.join(StringList)
        digitlist = list(string)
        intlist = map(int,digitlist)
        return list(intlist)
        
        