class Solution(object):
    def scoreBalance(self, s):
        """
        :type s: str
        :rtype: bool
        """
        total_sum = 0
        running_sum = 0
        for i in s:
            total_sum += ord(i) - ord('a') + 1

        for c in s:
            running_sum += ord(c) - ord('a') + 1
            if running_sum * 2 == total_sum:
                return True
        
        return False
        