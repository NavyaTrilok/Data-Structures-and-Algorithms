/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        
          Map<TreeNode, TreeNode> parent = new HashMap();
        Queue<TreeNode> queue = new LinkedList();


        // build the map, relation of node and its parent
        dfs(root, null, parent);
        Set<TreeNode> seen = new HashSet();
        queue.add(target);
        seen.add(target);
        int level = 0;


        // typical bfs 
        while (!queue.isEmpty()) {            
            if(level == K) break;
            int size = queue.size();            
            for(int i = 0 ; i < size; i++) {                            
                TreeNode node = queue.poll();         
                if (node.left != null && !seen.contains(node.left)) {
                    seen.add(node.left);
                    queue.offer(node.left);
                }
                if (node.right != null && !seen.contains(node.right)) {
                    seen.add(node.right);
                    queue.offer(node.right);
                }
                TreeNode par = parent.get(node);
                if (par != null && !seen.contains(par)) {
                    seen.add(par);
                    queue.offer(par);
                }
            }
            level++;
        }      


        // populate all values of node in queue
        List<Integer> ans = new ArrayList();
        for (TreeNode n: queue)
            ans.add(n.val);
        return ans;                   
    }
    
    
    public void dfs(TreeNode node, TreeNode par, Map<TreeNode, TreeNode> parent) {
        if (node != null) {
            parent.put(node, par);
            dfs(node.left, node, parent);
            dfs(node.right, node, parent);
        }
    }
}