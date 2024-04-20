class Solution {
    public String restoreString(String s, int[] indices) {
        char[] str = s.toCharArray();
        
        char[] str2 = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            str2[indices[i]] = str[i];
        }
        
        String str3 = String.valueOf(str2);
        
        return str3;
    }
}