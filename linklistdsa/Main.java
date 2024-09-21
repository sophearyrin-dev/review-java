public class Main {
    public static void main(String[] args) {
        LinkList linkList = new LinkList(1);
        // linkList.getHead();
        // linkList.getTail();
        // linkList.getLength();
        linkList.appends(2);
        linkList.appends(3);

        linkList.removeLast();
        linkList.removeLast();
        linkList.removeLast();

        linkList.printList();



    }
}
