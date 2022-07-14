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
    List<String> result;
    
    public List<String> binaryTreePaths(TreeNode root) {
        result = new LinkedList<>();
        
        helper(root,"");
        
        return result;
        
    }
    
    public void helper(TreeNode root, String str){
        if(root==null)
            return;
        
        if(root.left == null && root.right == null){
            result.add(str.concat(String.valueOf(root.val)));
        }
        
        helper(root.left,str.concat(String.valueOf(root.val).concat("->")));
        helper(root.right,str.concat(String.valueOf(root.val).concat("->")));
    }
}