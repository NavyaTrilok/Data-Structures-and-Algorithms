class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        recurse(res,0,0,"",n);
        return res;
    }
    
    public List<String> recurse(List<String> res, int left, int right, String s, int n){
        
        if(n*2==s.length()){
            res.add(s);
            return res;
        }
        
        if(left < n)
            recurse(res,left+1,right,s+'(',n);
        
        if(left > right)
            recurse(res,left,right+1,s+')',n);
        
        return res;
        
    }
}