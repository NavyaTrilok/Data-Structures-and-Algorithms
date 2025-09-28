class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> hm = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i < keyName.length; i++){
            String k = keyName[i];

            if(!hm.containsKey(k)){
                hm.put(k,new ArrayList<>());
            }
            hm.get(k).add(getTime(keyTime[i]));
        }

        for(String k : hm.keySet()){
            List<Integer> times = hm.get(k);

            Collections.sort(times);
            
            for(int i = 2; i < times.size(); i++){

                if(times.get(i) - times.get(i-2) <= 60){
                    res.add(k);
                    break;
                }

            }
        
        }

        Collections.sort(res);
        return res;
        
    }

    public int getTime(String KeyTime){
        String[] p = KeyTime.split(":");
        int mins = Integer.parseInt(p[0])*60+Integer.parseInt(p[1]);
        return mins;

    }
}