public class LinkList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public LinkList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        this.length = 1;
    }
}