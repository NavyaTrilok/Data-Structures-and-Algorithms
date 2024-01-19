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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        
        boolean flag = false;
        
        while(!que.isEmpty()){
            TreeNode tmp = que.poll();
            if(tmp == null) 
                flag = true;
            else{
                if(flag) return false;
                que.offer(tmp.left);
                que.offer(tmp.right);
            }
        }
        return true;
    }
}