package whatnot;

public class ReverseKNodes {


    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    public static void main(String[] args) throws Exception {
        ReverseKNodes reverseKNodes = new ReverseKNodes();
        Node node = reverseKNodes.createLinkedList1();
        reverseKNodes.printList(node);
        System.out.println();
        int k = 4;
        Node reversedNode = reverseKNodes.reverseList(node, k);
        reverseKNodes.printList(reversedNode);
    }

    private Node reverseList(Node node, int k) throws Exception {
        if (node == null || k <= 1) {
            return node;
        }
        Node head1 = node;
        Node prev = null;
        Node reversedNode = null;
        while (head1 != null) {
            Node head2 = head1;
            Node next = null;
            for (int i = 1; i < k && head2.next != null; i++) {
                head2 = head2.next;
                next = head2.next;
            }
            reverseKNodesInList(head1, head2);
            if (reversedNode == null) {
                reversedNode = head2;
            }
            if (prev != null) {
                prev.next = head2;
            }

            prev = head1;
            head1 = next;
        }
        return reversedNode;
    }

    private void reverseKNodesInList(Node head1, Node head2) {
        Node current = head1;
        Node prev = null;
        Node next = null;
        while (current != head2) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        current.next = prev;

    }

    private void printList(Node linkedList) {
        while (linkedList != null) {
            System.out.print(linkedList.data + "--->");
            linkedList = linkedList.next;
        }
    }

    private Node createLinkedList1() {
        Node n9 = new Node(9, null);
        Node n8 = new Node(8, n9);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        return n1;
    }
}
