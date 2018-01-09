package whatnot;

public class DeleteNodeFromLinkedList {

    class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }


    public static void main(String[] args) throws Exception {
        DeleteNodeFromLinkedList deleteNodeFromLinkedList = new DeleteNodeFromLinkedList();
        Node n = deleteNodeFromLinkedList.createLinkedList1();
        deleteNodeFromLinkedList.printList(n);
        System.out.println();
        Node linkedList = deleteNodeFromLinkedList.deleteNodeLinkedList(n, n);
        deleteNodeFromLinkedList.printList(linkedList);
    }

    private void printList(Node linkedList) {
        while (linkedList != null) {
            System.out.print(linkedList.data +"--->");
            linkedList = linkedList.next;
        }
    }

    private Node deleteNodeLinkedList(Node n, Node nodeToDelete) throws Exception {
        if(n==null || nodeToDelete==null){
           throw new Exception("Invalid data input");

        }
        Node head = n;
        Node previous = null;

        while (head.data != nodeToDelete.data
                ) {
            previous = head;
            head = head.next;
        }
      //  if(head.next!=null) {
            Node temp = head.next;
        if(previous!=null) {
            previous.next = temp;
        }
        else{return temp;}

        return n;
    }

    private Node createLinkedList1() {
        Node n4 = new Node(7, null);
        Node n3 = new Node(6, n4);
        Node n2 = new Node(5, n3);
        Node n1 = new Node(4, n2);
        return n1;
    }
}
