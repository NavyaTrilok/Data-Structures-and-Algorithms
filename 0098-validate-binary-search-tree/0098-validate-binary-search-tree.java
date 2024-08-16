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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorderlist = new LinkedList<>();
        
        helper(root, inorderlist);
        
        boolean isBST = true;
        int prev = inorderlist.get(0);
        for(int i  = 1; i < inorderlist.size();i++){
            if(inorderlist.get(i)<=prev)
                isBST = false;
            prev = inorderlist.get(i);
        }
        
        return isBST;
        
    }
    
    void helper(TreeNode node, List<Integer> inorderlist){
        if(node == null){
            return;
        }
        helper(node.left,inorderlist);
        inorderlist.add(node.val);
        helper(node.right,inorderlist);
    }
}