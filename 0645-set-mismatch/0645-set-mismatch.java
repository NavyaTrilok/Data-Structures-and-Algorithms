class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        for(int key : map.keySet()){
            if (map.get(key) == 2){
                res[0] = key;
            }
        }
        
        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                res[1] = i;
            }
        }
        
        return res;
        
    }
}