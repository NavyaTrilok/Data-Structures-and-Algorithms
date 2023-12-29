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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return al;
        
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        
        while(!nodeStack.isEmpty()){
            TreeNode mynode = nodeStack.peek();
            al.add(mynode.val);
            nodeStack.pop();
            
            if(mynode.right!=null){
                nodeStack.push(mynode.right);
            }
            
            if(mynode.left!=null){
                nodeStack.push(mynode.left);
            }
        }
        
        return al;
    }
    
}