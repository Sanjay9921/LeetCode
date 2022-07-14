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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0)
            return head;
    
        
        int n=1;
        ListNode p = head;
        
        while(p.next!=null){
            n++;
            p = p.next;
        }
        p.next = head;
        
        k = n-(k%n);
        
        while(k-- > 0){
            p = p.next;
        }
        
        head = p.next;
        p.next = null;
        
        return head;
        
    }
}