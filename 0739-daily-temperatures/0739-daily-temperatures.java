class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];

        Stack<Integer> st = new Stack<>();

        int n = temperatures.length;

        st.push(n-1);

        for(int i = n-2; i >=0; i--){
            
            while(st.size() > 0 && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans[i] = 0;
            }else{
                ans[i] = Math.abs(i-st.peek());
            }
            st.push(i);
        }
        return ans;
    }
}