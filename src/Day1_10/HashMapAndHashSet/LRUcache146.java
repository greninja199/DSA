package Day1_10.HashMapAndHashSet;

public class LRUcache146 {
    DoublyLinkedList doublyLinkedList;

    public LRUcache146(int capacity) {
        doublyLinkedList = new DoublyLinkedList(capacity);
    }

    public int get(int key) {
        return doublyLinkedList.get(key);
    }

    public void put(int key, int value) {
        doublyLinkedList.put(key, value);
    }
}
