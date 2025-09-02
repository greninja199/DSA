package Day1_10.LinkedList9;

public class ReorderList143 {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
            if(fast.next!=null)
                fast = fast.next;
        }
        ListNode dummy = new ListNode();
        dummy.next = slow;

        while(slow!=null && slow.next!=null){
            ListNode temp = slow.next;
            slow.next = slow.next.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }

        fast = head;
        slow = dummy.next;
        while(slow !=null){
            ListNode temp = slow.next;
            slow.next = fast.next;
            fast.next = slow;
            fast = fast.next.next;
            slow = temp;
        }
        fast.next = null;
    }
}
