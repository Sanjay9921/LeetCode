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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        
        helper(root);
        
        return root;
        
    }
    
    public void helper(TreeNode root){
        if(root==null)
            return;
        
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;   
        
        if(root.left!=null && root.right!=null){
            helper(root.left);
            helper(root.right);
        }
        else if(root.left==null)
            helper(root.right);
        else
            helper(root.left);
        
        
    }
}