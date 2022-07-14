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
    public TreeNode increasingBST(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        inorder(root, list);
        
        TreeNode newRoot = new TreeNode(0);
        TreeNode p = newRoot;
        
        for(int i: list){
            p.right = new TreeNode(i);
            p = p.right;
        }
        
        return newRoot.right;
        
    }
    
    public void inorder(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}