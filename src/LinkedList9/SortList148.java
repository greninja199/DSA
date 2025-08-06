package LinkedList9;

public class SortList148 {
    public ListNode sort(ListNode head){
        if(head == null || head.next==null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sort(head);
        ListNode right = sort(temp);
        return mergeList(left,right);
    }

    private ListNode mergeList(ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode();
        ListNode temp = dummyHead;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }
        while (left!=null){
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while(right!=null){
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }
        return dummyHead.next;
    }

    public ListNode sortList(ListNode head) {
        return sort(head);
    }
}
