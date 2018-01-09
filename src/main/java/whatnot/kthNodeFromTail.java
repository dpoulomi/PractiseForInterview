package whatnot;

public class kthNodeFromTail {

    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    public static void main(String[] args) throws Exception {
        kthNodeFromTail kthNodeFromTail = new kthNodeFromTail();
        Node node = kthNodeFromTail.createLinkedList1();
        int k = 7;
        kthNodeFromTail.printList(node);
        System.out.println();
        Node kthNode = kthNodeFromTail.findKthNodeFromTailOflInkedList(node, k);
        System.out.println(kthNode.data);

    }

    private void printList(Node linkedList) {
        while (linkedList != null ) {
            System.out.print(linkedList.data + "--->");
            linkedList = linkedList.next;
        }
    }

    private Node findKthNodeFromTailOflInkedList(Node n, int k) throws Exception {
        if (n == null || k==0) {
            throw new Exception("The linked list is null");
        }
        Node head = n;
        while (k != 0) {
            if (k != 0 && head == null) {
                throw new Exception("The vlue of k exceeds the number of nodes in the linked list");
            }
            head = head.next;
            k--;

        }
        Node slowptr = n;
        Node fastptr = head;
        while (fastptr != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next;

        }
        return slowptr;
    }

    private Node createLinkedList1() {
        Node n8 = new Node(8, null);
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
