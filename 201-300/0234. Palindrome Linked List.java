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
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        fast = reverse(slow);
        
        ListNode p = head;
        
        while(fast!=slow){
            if(p.val != fast.val)
                return false;
            
            p = p.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}