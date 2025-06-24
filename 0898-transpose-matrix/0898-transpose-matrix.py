class Solution(object):
    def transpose(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """


        rows = len(matrix)
        columns = len(matrix[0])

        result = []

        for c in range(columns):
            new_row = []
            for r in range(rows):
                new_row.append(matrix[r][c])
            result.append(new_row)

        return result


        