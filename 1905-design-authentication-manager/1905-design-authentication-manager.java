class AuthenticationManager {

    HashMap<String, Integer> map;
    int live;

    public AuthenticationManager(int timeToLive) {

        map = new HashMap<>();
        live = timeToLive;
        
    }
    
    public void generate(String tokenId, int currentTime) {

        map.put(tokenId , currentTime + live);
        
    }
    
    public void renew(String tokenId, int currentTime) {

        if(!map.containsKey(tokenId)) return;

        if(map.get(tokenId) > currentTime){
            map.put(tokenId, currentTime + live);
        }

        return;
        
    }
    
    public int countUnexpiredTokens(int currentTime) {

        int total = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue() > currentTime) {
            total++;
            }
        }
        return total;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */