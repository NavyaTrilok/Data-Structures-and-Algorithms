class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;

        int max_area = 0;

        while(left < right){

            int area = Math.min(height[left],height[right]) * (right - left);

            max_area = Math.max(area, max_area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }


        }

        return max_area;
        
    }
}