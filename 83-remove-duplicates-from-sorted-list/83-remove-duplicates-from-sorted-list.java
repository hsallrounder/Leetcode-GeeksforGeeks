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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode l = head;
        while (l != null) {
            ListNode temp = l;
            while(temp!=null && temp.val==l.val) {
                temp = temp.next;
            }
            l.next = temp;
            l = l.next;
        }
        return head;
    }
}