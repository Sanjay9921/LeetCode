/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p = head;
        ListNode fast = head;
        
        for(int i=1;i<=k-1;i++){
            fast = fast.next;
        }
        
        p = fast;
        ListNode q = head;
        
        while(fast.next!=null){
            fast = fast.next;
            q = q.next;
        }
        
        int t = p.val;
        p.val = q.val;
        q.val = t;
        
        return head;
        
    }
}