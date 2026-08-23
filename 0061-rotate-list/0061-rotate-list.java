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
        if(head == null || head.next == null) return head;
        ListNode counting = head;
        int count = 0;
        while(head.next != null){
            head = head.next;
            count ++;
        }
        head = counting;
        k = k % (count + 1);
        for(int i = 0; i < k; i ++){
            ListNode temp = head;
            while(head.next.next != null){
                head = head.next;
            }
            ListNode curr = head.next;
            head.next = null;
            curr.next = temp;
            head = curr;
        }
        return head;
    }
}