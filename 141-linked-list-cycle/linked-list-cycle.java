/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> arr = new ArrayList<>();

        while(head != null) {
            if(arr.contains(head)) {
                return true;
            }
            arr.add(head);
            head = head.next;
        }

        return false;
    }
}