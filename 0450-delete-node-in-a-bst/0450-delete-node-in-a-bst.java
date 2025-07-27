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
    
      public int min(TreeNode root) 
    {
        // write your code here
        while(root.left!=null)
        {
            root=root.left;
        }

        return root.val;
    }

    
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        if(root==null) return null;
        
        
        if(root.val==key)
        {
            if(root.right==null && root.left==null)
                return null;
            if(root.right==null)
            {
                return root.left;
            }
            if(root.left==null)
            {
                return root.right;
            }
            
            int right_min=min(root.right);
            
            root.val=right_min;
            root.right=deleteNode(root.right,right_min);
            
            return root;
        }

        if(root.val<key)
        {
            root.right=deleteNode(root.right,key);
        }
        else
        {
            root.left=deleteNode(root.left,key);
        }
        
        return root;
     
    }
  
    
      
}
