class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            if(!map.containsKey(word)){
                map.put(word,1);
            }else{
                map.put(word,map.get(word)+1);
            }
        }

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>(){

            public int compare(String word1, String word2){
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);

                if(frequency1 == frequency2)
                    return word2.compareTo(word1);
                return frequency1 - frequency2;
            }
        });

        for(Map.Entry<String,Integer> entry: map.entrySet()){
            pq.add(entry.getKey());
            if(pq.size() > k)
                pq.poll();
        }

        List<String> result = new ArrayList<>();

        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;

    }
}