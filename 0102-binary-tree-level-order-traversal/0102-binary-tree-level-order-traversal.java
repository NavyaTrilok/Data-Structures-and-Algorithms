/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(que.size() > 0){
            int size = que.size();
            List<Integer> al = new ArrayList<>();
            while(size-->0){
                TreeNode n = que.remove();
                
                al.add(n.val);
                if(n.left!=null){
                    que.add(n.left);
                }
                if(n.right!=null){
                    que.add(n.right);
                }
                
            }
            ans.add(al);
        }
        
        return ans;
    }
}