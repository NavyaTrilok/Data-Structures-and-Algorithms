class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        jewel_count = 0
        for i in jewels:
            jewel_count+=stones.count(i)
        return jewel_count
        