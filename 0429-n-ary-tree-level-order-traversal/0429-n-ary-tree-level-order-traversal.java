/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans = new LinkedList<>();
        
        if(root==null) return ans ;
        
        
        int size = 0;
        
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        while(que.size()>0){
            size = que.size();
            List<Integer> al = new ArrayList<>();
            while(size-->0){
                Node ele = que.remove();
                if(ele!=null){
                    al.add(ele.val);
                    for(Node child: ele.children){
                    if(child!=null){
                        que.add(child);
                    }
                }
            }
                
            }
            ans.add(al);
        }
        return ans;
    }
}