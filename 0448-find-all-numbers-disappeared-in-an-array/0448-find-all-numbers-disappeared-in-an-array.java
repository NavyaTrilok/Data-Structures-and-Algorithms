class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> st = new HashSet<>();
        
        for(int i : nums){
            st.add(i);
        }
        
        List<Integer> lst = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!st.contains(i))
                lst.add(i);
        }
        
        return lst;
    }
}