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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        boolean leftToRight = true;

        while (que.size() > 0) {
            int size = que.size();
            LinkedList<Integer> level = new LinkedList<>();

            while(size-- > 0) {
                TreeNode node = que.poll();

                if (leftToRight) {
                    level.addLast(node.val);  // normal order
                } else {
                    level.addFirst(node.val); // reverse order
                }

                if (node.left != null) 
                    que.add(node.left);

                if (node.right != null) 
                    que.add(node.right);
            }

            ans.add(new ArrayList<>(level)); //level linkedlist is converted to arraylist

            leftToRight = !leftToRight; //flip the traversal order for every iteration
        }

        return ans;
    }
}