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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList al = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode curr = root;
        
        while(curr!=null || st.empty() == false){
            
        
                while(curr!=null ){
                    st.push(curr);
                    curr = curr.left;
                }
                    curr = st.pop();
                    al.add(curr.val);
                    curr = curr.right;
        }
        
        return al;
    }
}