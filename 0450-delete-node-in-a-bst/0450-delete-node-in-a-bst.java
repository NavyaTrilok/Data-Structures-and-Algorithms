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
        if(root == null)
            return null;

        if(root.val == key){

            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            int right_min = min(root.right);
            root.val = right_min;
            root.right = deleteNode(root.right,right_min);

        }

        if(root.val < key){
            root.right = deleteNode(root.right,key);
        }
        else{
            root.left = deleteNode(root.left,key);
        }

        return root;
    }

    public int min(TreeNode node){

        while(node.left!=null){
            node = node.left;
        }

        return node.val;
    }
}