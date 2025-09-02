package Day1_10.LinkedList9;

public class RemoveNthNodeFromTheList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(n>0){
            fast = fast.next;
            if(fast == null)
                return null;
            n--;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public void printListNode(ListNode head) {
        while(head!=null) {
            System.out.print(head.val + " - > ");
            head = head.next;
        }
        System.out.println();
    }
}
