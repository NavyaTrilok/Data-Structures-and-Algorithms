class Solution {
    public int evalRPN(String[] tokens) {
        //int size = tokens.length-1;
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
         
                if(s.equals("*")){
                    int b = (st.pop());
                    int a = (st.pop());
                    ans = a * b;
                    st.push(ans);
                }else if(s.equals("/")){
                    int b = (st.pop());
                    int a = (st.pop());
                    ans = a / b;
                    st.push(ans);
                }else if(s.equals("+")){
                    int b = (st.pop());
                    int a = (st.pop());
                    ans = a + b;
                    st.push(ans);
                }else if(s.equals("-")){
                    int b = (st.pop());
                    int a = (st.pop());
                    ans = a - b;
                    st.push(ans);
                }else{
                    st.push(Integer.parseInt(s));
                }
            }
           return st.pop();            
        }
        
    }

