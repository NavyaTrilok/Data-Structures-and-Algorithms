class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> hs1 = new HashMap<>();
        Map<String,Integer> hs2 = new HashMap<>();
        
        for(int i = 0; i < words1.length; i++){
            if (hs1.containsKey(words1[i])){
                hs1.put(words1[i],hs1.get(words1[i])+1);
            }else{
                hs1.put(words1[i],1);
            }
        }
        
        for(int i=0;i < words2.length; i++){
            if(!hs2.containsKey(words2[i])){
                hs2.put(words2[i],1);
            }else{
                hs2.put(words2[i],hs2.get(words2[i])+1);
            }
        }
        
        int count=0;
        
        for(int i = 0; i < words1.length ; i++){
            if(hs1.get(words1[i]) == hs2.get(words1[i]) && hs2.get(words1[i]) == 1)
                count++;
        }
        
        return count;
            
    }
}