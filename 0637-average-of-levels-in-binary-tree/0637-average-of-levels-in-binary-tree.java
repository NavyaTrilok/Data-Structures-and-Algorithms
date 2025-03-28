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
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Double> ans = new ArrayList<>();
        
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        while (!que.isEmpty()) {
            double sum = 0.0; // Initialize sum as double
            int size = que.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode n = que.remove();
                sum += n.val; // Add the node value to the sum
                
                if (n.left != null) {
                    que.add(n.left);
                }
                if (n.right != null) {
                    que.add(n.right);
                }
            }
            
            // Calculate average as double
            double sub_ans = sum / size; // No need to cast, since sum is double
            
            ans.add(sub_ans);
        }
        
        return ans;
    }
}
