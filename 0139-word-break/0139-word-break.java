class Solution {
    Map<String, Boolean> map = new HashMap<>(); 
    public boolean wordBreak(String s, List<String> worddict) {
        if(worddict.contains(s))
            return true;
        
        if(map.containsKey(s))
            return map.get(s);
        
        for(int i = 1; i <= s.length(); i++){
            String left = s.substring(0, i);
            if(worddict.contains(left) && wordBreak(s.substring(i),worddict)){
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
}