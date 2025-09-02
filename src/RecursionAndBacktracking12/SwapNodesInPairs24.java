package RecursionAndBacktracking12;

import Day1_10.LinkedList9.ListNode;

public class SwapNodesInPairs24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode nextHead = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = swapPairs(nextHead);
        return head;
    }
}
