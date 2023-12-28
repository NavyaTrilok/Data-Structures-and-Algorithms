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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        HashMap<TreeNode, TreeNode> parenthm = new HashMap<>();
        Queue<TreeNode> que = new LinkedList<>();
        
        dfs(root,null,parenthm);
        HashSet<TreeNode> seen = new HashSet<>();
        que.add(target);
        seen.add(target);
        int level = 0;
        while(!que.isEmpty()){
            if(level == k)
                break;
            int size = que.size();
            
            for(int i = 0;i < size;i++){
                
                TreeNode node = que.poll();
                
                if(node.left != null && !seen.contains(node.left)){
                    que.offer(node.left);
                    seen.add(node.left);
                }
                
                if(node.right != null && !seen.contains(node.right)){
                    que.offer(node.right);
                    seen.add(node.right);
                }
                
                TreeNode parentNode = parenthm.get(node);
                if(parentNode!=null && !seen.contains(parentNode)){
                    que.offer(parentNode);
                    seen.add(parentNode);
                }
                
            }
            
            level++;
            
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(TreeNode n: que){
            al.add(n.val);
        }
        
        return al;
    }
    
    public static void dfs(TreeNode node,TreeNode par,Map<TreeNode,TreeNode> parenthm){
        
        if(node!=null){
            parenthm.put(node,par);
            dfs(node.left,node,parenthm);
            dfs(node.right,node,parenthm);
        }
        
    }
}