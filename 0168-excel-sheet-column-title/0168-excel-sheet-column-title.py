class Solution(object):
    def convertToTitle(self, columnNumber):
        """
        :type columnNumber: int
        :rtype: str
        """
        res = ""

        while columnNumber > 0 :
            reminder = (columnNumber - 1) % 26
            res += chr(ord('A') + reminder)
            columnNumber = (columnNumber-1) / 26

        return res[::-1]
        