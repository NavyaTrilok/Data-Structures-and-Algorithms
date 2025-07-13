class Solution {
    public String processStr(String s) {
        
        StringBuilder br = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                if(br.length()>0)
                    br.deleteCharAt(br.length()-1);
            }else if(ch == '#'){
                br.append(br);
            }else if(ch == '%'){
                br = new StringBuilder(br.reverse());
            }else{
                br.append(ch);
            }
        }

        return br.toString();

    }

}