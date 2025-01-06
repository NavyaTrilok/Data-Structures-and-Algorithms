class Solution(object):
    def shortestToChar(self, s, c):
        """
        :type s: str
        :type c: str
        :rtype: List[int]
        """

        def letter_get(c,dr):
            n = len(s)
            cur = -n
            res = n*[0]
            for i in range(n)[::dr]:
                if s[i] == c:
                    cur = i
                res[i] = abs(i-cur)
            return res
        
        return [min(x,y) for x,y in zip(letter_get(c,1),letter_get(c,-1))]

        