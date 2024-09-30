class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int total = 0;
        int begin = timeSeries[0];
       
        
        for (int t : timeSeries){
            
            total = total + (t < begin + duration ? t - begin : duration);
                
            begin = t;
            
        }
        
        return total + duration;
        
    }
}