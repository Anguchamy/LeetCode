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
        ListNode result = new ListNode(0);
        ListNode result1 = result;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                result.next = new ListNode(list1.val);
                result = result.next;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                result.next = new ListNode(list2.val);
                result = result.next;
                list2 = list2.next;
            } else if (list1.val == list2.val) {
                result.next = new ListNode(list1.val);
                result = result.next;
                list1 = list1.next;

                result.next = new ListNode(list2.val);
                result = result.next;
                list2 = list2.next;
            }
        }

        while(list1 != null) {
            result.next = new ListNode(list1.val);
            list1 = list1.next;
            result = result.next;
        }

        while(list2 != null) {
            result.next = new ListNode(list2.val);
            list2 = list2.next;
            result = result.next;
        }

        return result1.next;
    }
}