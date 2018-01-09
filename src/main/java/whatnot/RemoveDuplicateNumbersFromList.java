package whatnot;

public class RemoveDuplicateNumbersFromList {

    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    public static void main(String[] args) {
        RemoveDuplicateNumbersFromList removeDuplicateNumbersFromList = new RemoveDuplicateNumbersFromList();
        Node head = removeDuplicateNumbersFromList.createLinkedList1();
        removeDuplicateNumbersFromList.printList(head);
        System.out.println();
        removeDuplicateNumbersFromList.removeDuplicteNumbers(head);
        removeDuplicateNumbersFromList.printList(head);


    }

    private void printList(Node linkedList) {
        while (linkedList != null) {
            System.out.print(linkedList.data +"--->");
            linkedList = linkedList.next;
        }
    }

    private void removeDuplicteNumbers(Node head) {
        if(head==null){
            return;
        }
        Node n = head;
        Node temp=null;
        while (n != null && n.next!=null) {
            Node prev=n;
            while (n.next!=null && n.data == n.next.data) {
                n = n.next;
            }
            temp=n.next;
            n=n.next;
            prev.next=temp;
        }
    }

    private Node createLinkedList1() {
        Node n8 = new Node(1, null);
        Node n7 = new Node(1, n8);
        Node n6 = new Node(1, n7);
        Node n5 = new Node(1, n6);
        Node n4 = new Node(1, n5);
        Node n3 = new Node(1, n4);
        Node n2 = new Node(1, n3);
        Node n1 = new Node(1, n2);
        return n1;
    }
}
