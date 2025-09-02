package Day1_10.AdvancedLinkedListsAndCycles10;

import java.util.HashMap;

public class CopyListWithRandomNumbers138 {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        HashMap<Node, Node> nodeMapper = new HashMap<>();
        Node newHead = new Node(head.val);
        Node oldIt = head;
        Node newIt = newHead;
        nodeMapper.put(null,null);
        nodeMapper.put(head, newHead);
        while(oldIt.next!=null){
            oldIt = oldIt.next;
            newIt.next= new Node(oldIt.val);
            newIt = newIt.next;
            nodeMapper.put(oldIt,newIt);
        }
        newIt.next = null;
        oldIt = head;
        newIt = newHead;
        while(oldIt!=null){
            newIt.random = nodeMapper.get(oldIt.random);
            newIt = newIt.next;
            oldIt = oldIt.next;
        }
        return newHead;
    }
}
