class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
    public int compare(Integer num1, Integer num2) {
        int frequency1 = map.get(num1);
        int frequency2 = map.get(num2);

        if (frequency1 == frequency2)
            return num2 - num1; // larger number first when frequency is same
        return frequency1 - frequency2; // smaller frequency first
    }
});

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
            if(pq.size() > k)
                pq.poll();
        }
        

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = pq.poll();
        }

        return ans;
    }
}