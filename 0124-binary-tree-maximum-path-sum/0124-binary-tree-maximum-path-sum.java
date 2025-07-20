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
    public int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        int ans = 0;
        max[0] = Integer.MIN_VALUE;
        maxPath(root, max);
        return max[0];
        
    }

    public int maxPath(TreeNode root, int[] max_value){
        if(root == null) 
            return 0;

        int leftsum = Math.max(0, maxPath(root.left, max_value));
        int rightsum = Math.max(0, maxPath(root.right, max_value));
        max_value[0] = Math.max(max_value[0], leftsum + rightsum +  root.val);

        return root.val + Math.max(leftsum, rightsum);
    }


}