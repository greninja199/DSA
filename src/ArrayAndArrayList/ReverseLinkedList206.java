package ArrayAndArrayList;

public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = null;
        while(curr !=null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head = prev;
        return head;
    }

}
