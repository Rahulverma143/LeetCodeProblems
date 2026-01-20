class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int x = count-n+1;
        if(x==1){
            head=head.next;
            return head;
        }
         ListNode prev = head;
        int j = 1;
        while(j<x-1){
            prev=prev.next;
            j++;
        }
        prev.next = prev.next.next;
        return head;
    }
}

