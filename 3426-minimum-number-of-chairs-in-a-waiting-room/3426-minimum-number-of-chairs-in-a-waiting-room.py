class Solution(object):
    def minimumChairs(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        ans = 0
        for i in s:
            if i == 'E':
                count += 1
            else:
                count -= 1
            ans = max(count,ans)
        
        return ans