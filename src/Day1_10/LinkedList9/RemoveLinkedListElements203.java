package Day1_10.LinkedList9;

public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode prev = dummyHead;
        ListNode curr = head;

        while(curr!=null){
            if(curr.val == val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return dummyHead.next;
    }
}
