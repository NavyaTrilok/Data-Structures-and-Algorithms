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
    ArrayList<Integer> al = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = inorderTraversal(root);
        System.out.println(ans);
        int res = ans.get(k-1);
        return res;
    }
    
    public List<Integer> inorderTraversal(TreeNode node){
        if(node!=null){
            inorderTraversal(node.left);
            al.add(node.val);
            inorderTraversal(node.right);
        }
        return al;
    }
}