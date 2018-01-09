package whatnot;

public class ReverseLinkedList
    {
    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    public static void main(String[] args) throws Exception {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node node = reverseLinkedList.createLinkedList1();
        reverseLinkedList.printList(node);
        System.out.println();
        Node reversedNode = reverseLinkedList.reverseList(node);
        reverseLinkedList.printList(reversedNode);
    }

    private Node reverseList(Node node) throws Exception {
        if (node == null) {
            throw new Exception("The node is null");
        }
        Node current = node;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }

    private void printList(Node linkedList) {
        while (linkedList != null) {
            System.out.print(linkedList.data + "--->");
            linkedList = linkedList.next;
        }
    }

    private Node createLinkedList1() {
       /* Node n8 = new Node(8, null);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);*/
        Node n1 = new Node(1, null);
        return n1;
    }
}
