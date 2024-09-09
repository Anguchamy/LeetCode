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
    public ListNode modifiedList(int[] nums, ListNode head) {
		Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

		ListNode node = new ListNode(-1);
		ListNode temp = node;

		while(head != null) {
			if(!numSet.contains(head.val)) {
				node.next = head;
				node = node.next;
			}
			head = head.next;
		}
		node.next = null;
		return temp.next;
	}
}