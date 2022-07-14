/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la=0;
        int lb=0;
        
        ListNode p = headA;
        ListNode q = headB;
        
        while(p!=null){
            la++;
            p = p.next;
        }
        
        while(q!=null){
            lb++;
            q = q.next;
        }
        
        ListNode big = null;
        ListNode small = null;
        int diff=0;
        
        if(la<lb){
            small = headA;
            big = headB;
            diff = lb - la;
        }
        else{
            small = headB;
            big = headA;
            diff = la - lb;
        }
        
        for(int i=0;i<diff;i++){
            big = big.next;
        }
        
        while(big!=null && small!=null){
            if(big == small)
                return big;
            
            big = big.next;
            small = small.next;
        }
        
        return null;
    }
}