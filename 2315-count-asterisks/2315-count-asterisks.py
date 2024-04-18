class Solution(object):
    def countAsterisks(self, s):
        return sum([a.count('*') for a in s.split('|')][0::2])
        