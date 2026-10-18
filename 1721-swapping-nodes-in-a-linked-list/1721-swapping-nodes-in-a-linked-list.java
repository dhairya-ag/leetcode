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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int t = list.get(k - 1);
        list.set(k - 1, list.get(list.size() - k));
        list.set(list.size() - k, t);
        ListNode res = new ListNode(0);
        ListNode s = res;
        for(int num : list){
            s.next = new ListNode(num);
            s = s.next;
        }
        return res.next;
    }
}