class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0; i<n; i++){
            fast = fast.next;
        }
        if(fast == null ) return head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode del = slow.next;
        slow.next = slow.next.next;
        return head;
    }
}
