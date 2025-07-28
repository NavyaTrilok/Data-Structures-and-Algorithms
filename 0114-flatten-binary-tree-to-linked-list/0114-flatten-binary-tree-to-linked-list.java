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
public class Solution {
    public void flatten(TreeNode root) {
        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {
                // Find rightmost node in left subtree
                TreeNode predecessor = current.left;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }

                // Connect right subtree to right of predecessor
                predecessor.right = current.right;

                // Move left subtree to right
                current.right = current.left;
                current.left = null;
            }

            // Move to next right node
            current = current.right;
        }
    }
}
