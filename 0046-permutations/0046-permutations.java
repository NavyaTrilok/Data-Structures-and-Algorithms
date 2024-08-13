class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        countpermutations(nums,ans,new ArrayList<>());
        
        return ans;
    }
    
    public void countpermutations(int[] nums, List<List<Integer>> ans, List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int num:nums){
            if(list.contains(num)){
                continue;
            }
            list.add(num);
            countpermutations(nums,ans,list);
            list.remove(list.size()-1);
        }
    }
}