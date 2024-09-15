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

    public void printList(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void getHead(){
        System.out.println("Head : " + this.head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + this.tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + this.length);
    }

    public void appends(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
}