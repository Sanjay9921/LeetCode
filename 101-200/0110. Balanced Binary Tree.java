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
    
    boolean globalFlag;
    
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        
        globalFlag = true;
        
        int lh = height(root.left,false);
        int rh = height(root.right,false);
        
        return (globalFlag==true) && (Math.abs(lh-rh)<=1);
    }
    
    public int height(TreeNode root, boolean flag){
        if(root==null)
            return 0;
        
        int lh = height(root.left,true);
        int rh = height(root.right,true);
        
        if(Math.abs(lh-rh)>1 && globalFlag==true){
            globalFlag = false;
        }
        
        return 1+Math.max(lh,rh);
    }
}