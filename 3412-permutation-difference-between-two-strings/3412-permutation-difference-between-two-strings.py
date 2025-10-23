class Solution(object):
    def findPermutationDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: int
        """
        sum = 0
        for i in range(len(s)):
            num = abs(i - t.index(s[i]))
            sum += num

        return sum

        