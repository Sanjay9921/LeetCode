/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        
        Map<Node,Node> map = new HashMap<Node, Node>();
        
        Node t = head;
        Node result = null;
        Node p = null;
        
        while(t!=null){
            Node node = new Node(t.val);
            map.put(t,node);
            
            if(result==null){
                result = node;
                p = node;
            }else{
                p.next = node;
                p = node;
            }
            
            t = t.next;
        }
        
        p = result;
        
        while(head!=null){
            Node node = map.get(head.random);
            p.random = node;
            
            head = head.next;
            p = p.next;
        }
        
        return result;
    }
}