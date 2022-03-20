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
        ListNode p1=headA,p2=headB;
        int lena=0,lenb=0;
        while(p1!=null){
            lena++;
            p1=p1.next;
        }
        while(p2!=null){
            lenb++;
            p2=p2.next;
        }
        p1=headA;p2=headB;
        if(lena>lenb){
            for(int i=0;i<Math.abs(lena-lenb) && p1!=null;i++){
                p1=p1.next;
            }
        }
        else{
            for(int i=0;i<Math.abs(lena-lenb) && p2!=null;i++){
                p2=p2.next;
            }
        }
        while(p1!=null && p2!=null){
            if(p1==p2) return p1;
            p1=p1.next;
            p2=p2.next;
        }
        return null;
    }
}