class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> st = new Stack<>();

        for(String part : parts){
            if(part.equals("") || part.equals("."))
                continue;
            else if(part.equals("..")){
                if(st.size()!=0)
                    st.pop();
            }else{
                st.push(part);
            }
        }

        StringBuilder result = new StringBuilder();

        for(String dir : st){
            result.append('/').append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";


    }
}