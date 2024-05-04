class Solution(object):
    def diagonalSum(self, mat):
        n = len(mat)
        mid = n/2
        s = 0
        for i in range(len(mat)):
            
                s += mat[i][i]
                
                s += mat[n-1-i][i]
        if n % 2 == 1:
            s -= mat[mid][mid]
        return s
                    
                
        