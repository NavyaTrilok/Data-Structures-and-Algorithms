class Solution(object):
    def luckyNumbers (self, matrix):
        minrow = {min(r) for r in matrix}
        maxcol = {max(x) for x in zip(*matrix)}
        return list(minrow & maxcol)
        
        #zip(*matrix) is a Python idiom to transpose the matrix. It converts rows to columns and #vice versa.