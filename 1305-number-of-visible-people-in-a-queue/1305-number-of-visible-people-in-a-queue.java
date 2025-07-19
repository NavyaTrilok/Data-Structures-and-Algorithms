class Solution {
    public int[] canSeePersonsCount(int[] heights) {

        Stack<Integer> st = new Stack<>();

        int[] results = new int[heights.length];

        results[heights.length-1] = 0;

        for(int i = heights.length-1; i >= 0 ; i--){
            int visible = 0;

            while(!st.isEmpty() && heights[i] > st.peek()){
                visible += 1;
                st.pop();
            }

            if(!st.isEmpty()){
                visible += 1;
            }

            results[i] = visible;
            st.push(heights[i]);

        }

        return results;
        
    }
}