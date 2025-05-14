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
    static int maxDia;
    public int levels(TreeNode root){
        if(root==null)
            return 0;
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        int Dia = leftlevels + rightlevels;
        maxDia = Math.max(Dia,maxDia);
        return Math.max(leftlevels,rightlevels) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        maxDia = 0;
        levels(root);
        return maxDia;
    }
}