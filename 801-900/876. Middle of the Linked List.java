// Linear Iteration
// Time Complexity:= O(N)
// Space Complexity:= O(1)

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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        int count=0;
        ListNode p = head;
        while(p!=null){
            count++;
            p = p.next;
        }

        int i=0;
        p = head;
        while(i<count/2){
            p = p.next;
            i++;
        }

        return p;
    }
}