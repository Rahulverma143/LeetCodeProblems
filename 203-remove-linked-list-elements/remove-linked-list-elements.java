class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode Dummy = new ListNode(0);
        Dummy.next = head;
        ListNode curr = head;
        ListNode prev = Dummy;
        while(curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return Dummy.next;
    }
}