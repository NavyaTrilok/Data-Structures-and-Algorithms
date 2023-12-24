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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(key < root.val){
            root.left = deleteNode(root.left,key);
        }else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }else if(key == root.val) {
            //work
            if(root.left!=null && root.right!=null){
                int lmax = max(root.left);
                root.val = lmax;
                root.left = deleteNode(root.left,lmax);
                return root;
            }else if(root.left != null){
                return root.left;
            }else if(root.right != null){
                return root.right;
            }else{
                return null;
            }
            
        }
        
        return root;

    }
    
    public static int max(TreeNode node){
        if(node.right != null){
            return max(node.right);
        }else{
            return node.val;
        }
        
    }
}