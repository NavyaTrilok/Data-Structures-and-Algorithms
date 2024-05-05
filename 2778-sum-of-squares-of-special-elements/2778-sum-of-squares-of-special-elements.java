class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sp = 0;
        int square = 0;
        int sum_of_squares = 0;
        for(int i = 0; i < nums.length; i++){
            if (n % (i+1) == 0){
                System.out.println(i);
                sp = nums[i];
                square = sp * sp;
                sum_of_squares += square;
            }
               
        }
        
        return sum_of_squares;
    }
}