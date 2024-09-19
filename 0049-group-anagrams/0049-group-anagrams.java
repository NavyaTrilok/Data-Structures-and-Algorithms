class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for( String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String SortedWord = new String(chars);
            if(!map.containsKey(SortedWord)){
                map.put(SortedWord,new ArrayList<>());
            }
            map.get(SortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
        
    }
}