
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val - b.val); //sort based on value
        while(head != null){
            pq.add(head);
            head = head.next;
        }
        ListNode newHead = pq.remove(); // create initial node to start
        ListNode res = newHead;
        newHead.next = null;
        while(!pq.isEmpty()){ // while iterating add remaining nodes at the end of the list
            ListNode temp = pq.remove();
            newHead.next = temp;
            newHead = newHead.next;
        }
        newHead.next = null;
        return res;
    }
}