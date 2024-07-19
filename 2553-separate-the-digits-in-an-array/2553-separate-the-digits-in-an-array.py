class Solution(object):
    def separateDigits(self, nums):
                                        #List = [13,25,83,77]
        StringList = map(str, nums)     #StringList = ['13','25','83','77']
        string = ''.join(StringList)    #string = "13258377"
        digitlist = list(string)        #digitlist = ['1','3','2','5','8','3','7','7']
        intlist = map(int,digitlist)    #intlist = [1,3,2,5,8,3,7,7]
        return intlist                  #re
        
        