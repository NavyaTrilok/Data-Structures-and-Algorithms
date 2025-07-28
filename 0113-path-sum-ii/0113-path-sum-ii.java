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

    public static void pathSum(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> smallans){
        if(root == null) return;

        if(root.left == null && root.right == null){
            if(targetSum - root.val == 0){
                List<Integer> base = new ArrayList<>(smallans);
                base.add(root.val);
                res.add(base);
            }
            return;
        }

        smallans.add(root.val);

        pathSum(root.left, targetSum - root.val, res, smallans);
        pathSum(root.right, targetSum - root.val, res, smallans);

        smallans.remove(smallans.size() - 1);
    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> smallans = new ArrayList<>();

        pathSum(root, targetSum, res, smallans);
        return res;
    }
}