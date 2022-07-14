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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;
        
        ListNode result = new ListNode(0);
        ListNode t = result;
        
        while(p != null && q != null){
            if(p.val < q.val){
                t.next = new ListNode(p.val);
                p = p.next;
                t = t.next;
            }
            else{
                t.next = new ListNode(q.val);
                q = q.next;
                t = t.next;
            }
            
        }
        
        while(p != null){
            t.next = new ListNode(p.val);
            p = p.next;
            t = t.next;
        }
        
        while(q != null){
            t.next = new ListNode(q.val);
            q = q.next;
            t = t.next;
        }
        
        return result.next;
    }
}