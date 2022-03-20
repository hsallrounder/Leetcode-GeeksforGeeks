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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null && n==1) return null;
        if(head.next.next==null && n==2) return head.next;
        ListNode x=head;
        int i=0;
        while(x!=null){
            x=x.next;i++;
        }
        if(i==n) return head.next;
        ListNode y=head;
        for(int j=0;j<i-n-1;j++){
            y=y.next;
        }
        y.next=y.next.next;
        return head;
    }
}