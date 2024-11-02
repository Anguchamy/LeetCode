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
        List<ListNode> arr = new ArrayList<>();

        while(headA != null) {
            arr.add(headA);
            headA = headA.next;
        }

        while(headB != null) {
            if(arr.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }
}