class Solution(object):
    def checkRecord(self, s):
        """
        :type s: str
        :rtype: bool
        """

        for i in s:
            if 'LLL' in s:
                return False
            elif s.count('A') >= 2:
                return False
        return True
        