class Solution(object):
    def maximumWealth(self, accounts):
        richest = 0
        s = 0
        for i in range(len(accounts)):
            s = 0
            for j in range(len(accounts[0])):
                s += accounts[i][j]
            if richest < s:
                richest = s
        
        return richest
        
        