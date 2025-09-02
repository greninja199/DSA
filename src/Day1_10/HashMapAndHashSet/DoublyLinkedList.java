package Day1_10.HashMapAndHashSet;

import java.util.HashMap;

public class DoublyLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;
    private HashMap<Integer,DoublyLinkedListNode> cacheMap;
    private int capacity;

    public DoublyLinkedList(int size){
        cacheMap = new HashMap<>(size);
        capacity = size;
    }
    public void addElementToTail(DoublyLinkedListNode temp){
        if(tail == null){
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
            tail.next = null;
        }
    }
    public void removeAnElement(DoublyLinkedListNode temp){
        if(temp == head && temp == tail){
            head = null;
            tail = null;
        }
        else if(temp == head){
            head = head.next;
            head.prev = null;
        }
        else if(temp ==tail){
            tail = tail.prev;
            tail.next = null;
        }
        else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next=null;
            temp.prev=null;
        }
    }
    public int get(int key){
        if(cacheMap.containsKey(key)){
            DoublyLinkedListNode d = cacheMap.get(key);
            removeAnElement(d);
            addElementToTail(d);
            return tail.value;
        }
        else
            return -1;
    }
    public void put(int key, int value){
        if(cacheMap.containsKey(key)){
            cacheMap.get(key).value = value;
            removeAnElement(cacheMap.get(key));
            addElementToTail(cacheMap.get(key));
        }
        else{
            DoublyLinkedListNode temp = new DoublyLinkedListNode();
            temp.key = key;
            temp.value = value;
            cacheMap.put(key,temp);
            if(cacheMap.size()>capacity){
                cacheMap.remove(head.key);
                removeAnElement(head);
                addElementToTail(temp);
            }
            else{
                addElementToTail(temp);
            }
        }
    }
}
