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
        int length = getLength(head);
        int nodeToDelete = (length - n);
        if(nodeToDelete == 0) {
            return head.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        int index = 0;
        while(head != null) {
            if(index == nodeToDelete) {
                prev.next = head.next == null ? null : head.next;
                break;
            }

            index++;
            prev = head;
            head = head.next;
        }


        return temp;
    }

    public int getLength(ListNode head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}


/*
node = 1
len = 10;

*/