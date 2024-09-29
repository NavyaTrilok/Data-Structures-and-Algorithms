class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {     
        
        int row = 0;
        int col = matrix[0].length - 1;
        
        if(row==col){
            if(matrix[row][col]==target)
                return true;
        }
        
        while( col >= 0 && row <= matrix.length-1){
            if(matrix[row][col] == target)
                return true;
                
            if(matrix[row][col] < target)
                row++;
            else
                col--;
                
        }
        return false;
        
    }
}