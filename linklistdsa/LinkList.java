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

    //Remove Last node, we have 2 cases
    // 1. remove when have many items: We will remove it then return the list back

    public Node removeLast(){
        if(length ==0) return null;
        //if(head == null || tail == null) return null;

        Node temp = head;
        Node pre = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;

    }

    //prepend node
    public void prepend(int value){
        Node newNode = new Node(value);

        if(head == null || length == 0){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //Remove First
    public Node RemoveFirst(){
        Node tmp = head;

        if(head == null || length == 0){
            return null;
        }

        head = head.next;
        tmp.next = null;
        length--;
        if(length ==0){
            tail = null;
        }

        return tmp;
    }

    //Get a node at particular index
    // public Node getNode(int index){
    
    //     if(head == null || length ==0 || index<0 || index>length){
    //         return null;
    //     }
    //     Node tmp = head;
    //     int count = -1;
    //     if(length == 1){
    //         return head;
    //     }
    //     while(tmp.next !=null){
    //         count++;
    //         if(count == index) return tmp;
    //         tmp = tmp.next;
    //     }

    //     return tmp;
    // }

    public Node getNode(int index){
    
        if(head == null || length ==0 || index<0 || index>length){
            return null;
        }
        Node tmp = head;
        
        for(int i=0; i<index;i++){
            tmp = tmp.next;
        }

        return tmp;
    }

    public boolean setNode(int index, int value){
        Node tmp = getNode(index);
        if(tmp != null){
            tmp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index <0 || index >length) return false;
        if(index ==0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            appends(value);
            return true;
        }

        Node newNode = new Node(value);
        Node tmp = getNode(index -1);
        newNode.next = tmp.next;
        tmp.next = newNode;
        length++;
        return true;
    }

    //remove

    public Node remove(int index){

        if(index<0 || index >= length) return null;
        
        if(index ==0) return RemoveFirst();
        if(index == length - 1) return removeLast();

        Node prev = getNode(index - 1);
        Node tmp = prev.next;
        prev.next = tmp.next;
        tmp.next = null;
        length--;
        return tmp;
    }

    //reverse

    public void reverse(){
        Node tmp = head;
        head = tail;
        tail = tmp;

        Node after = tmp.next;
        Node before = null;

        for(int i=0; i<length ;i++){
            after = tmp.next;
            tmp.next = before;
            before = tmp;
            tmp = after;

        }


    }



}