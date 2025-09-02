package Day1_10.AdvancedLinkedListsAndCycles10;

import Day1_10.LinkedList9.ListNode;

public class ReverseNodesInKGroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<=1)
            return head;

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode curr = prev.next;
        while(curr!=null){
            int counter = 0;
            ListNode iterator = curr;
            //System.out.println("curr: "+ curr.val);
            //printListNode(dummyHead.next);
            while(counter!=k && iterator!=null){
                //System.out.println(counter+" : "+ iterator.val);
                counter++;
                iterator = iterator.next;
                //System.out.println(counter+" : "+ iterator.val);
            }
            if(counter!=k) {
                //printListNode(dummyHead.next);
                return dummyHead.next;
            }

            //reversing k-elements next to prev
            while(counter>1){
                ListNode temp = curr.next;
                curr.next = temp.next;
                temp.next = prev.next;
                prev.next = temp;
                //printListNode(dummyHead.next);
                counter--;
            }
            prev = curr;
            curr = curr.next;
        }
        return dummyHead.next;
    }

    public void printListNode(ListNode head) {
        while(head!=null) {
            System.out.print(head.val + " - > ");
            head = head.next;
        }
        System.out.println();
    }
}
