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
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) return ans; 

        LinkedList<TreeNode> que = new LinkedList<>();

        que.add(root);

        while(que.size() > 0){
            int size = que.size();
            ArrayList<Integer> al = new ArrayList<>();
            while(size-- > 0){
                TreeNode nn = que.removeFirst();

                if(nn!=null){

                    al.addLast(nn.val);

                    if(nn.left != null){
                        que.addLast(nn.left);
                    }

                    if(nn.right != null){
                        que.add(nn.right);
                    }

                }

            }

            ans.add(al.get(al.size()-1));
            
        }

        return ans;
    }
}