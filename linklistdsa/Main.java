public class Main {
    public static void main(String[] args) {
        LinkList linkList = new LinkList(1);
        // linkList.getHead();
        // linkList.getTail();
        // linkList.getLength();
        linkList.appends(2);
        linkList.appends(3);

        //linkList.removeLast();
        // linkList.removeLast();
        // linkList.removeLast();

        //linkList.prepend(0);

        //linkList.RemoveFirst();

        System.out.println("get node by index " + linkList.getNode(1).value + "\n");
  
        linkList.printList();






    }
}
