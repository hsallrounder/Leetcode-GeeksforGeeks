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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode p = l;
        int carry=0,sum,x,y;
        while(l1!=null || l2!=null){
            sum=0;
            x=(l1!=null) ? l1.val : 0;
            y=(l2!=null) ? l2.val : 0;
            sum+=(x+y+carry);
            p.next = new ListNode(sum%10);
            p=p.next;
            carry=sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0){
            p.next = new ListNode(carry);
        }       
        return l.next;
    }
}