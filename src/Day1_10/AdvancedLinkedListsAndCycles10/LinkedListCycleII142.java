package Day1_10.AdvancedLinkedListsAndCycles10;

import Day1_10.LinkedList9.ListNode;

/*
       ListNode curr = head;

       while(curr!=null){
           ListNode slow = curr;
           ListNode fast = curr;
           int counter = 2;
           while(counter>0 && fast !=null){
               System.out.print(counter);
               if(slow==fast)
                   counter--;
               slow = slow.next;
               fast = fast.next;
               if(fast!=null)
                   fast=fast.next;
               else
                   return null;
               if(slow==curr ||fast==curr)
                   return curr;
           }
           if(fast==null)
               return null;
           if(slow==curr || fast==curr)
               return curr;
           curr = curr.next;
       }
        return null;

         */
public class LinkedListCycleII142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null ){
            slow = slow.next;
            fast = fast.next;
            if(fast!=null)
                fast = fast.next;
            if(fast==slow)
                break;
        }
        if(fast==null)
            return null;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}