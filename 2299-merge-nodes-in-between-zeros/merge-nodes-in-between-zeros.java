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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        while(head != null) {
            int sum = 0;
            head = head.next;
            while(head != null && head.val != 0) {
                sum += head.val;
                head = head.next;
            }
            if(sum != 0) {
                System.out.println(sum);
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
        }

        return result.next;
    }
}