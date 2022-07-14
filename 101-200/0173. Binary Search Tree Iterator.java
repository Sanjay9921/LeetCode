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
class BSTIterator {

    Deque<TreeNode> stack;
    
    public BSTIterator(TreeNode root) {
        stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        updateStack(node);
    }
    
    public int next() {
        TreeNode poppedNode = stack.pop();
        updateStack(poppedNode.right);
        return poppedNode.val;
    }
    
    public boolean hasNext() {
        return stack.isEmpty()?false:true;
    }
    
    public void updateStack(TreeNode node){
        while(node!=null){
            stack.push(node);
            node = node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */