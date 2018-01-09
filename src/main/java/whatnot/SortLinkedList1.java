package whatnot;

public class SortLinkedList1 {

    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    public static void main(String[] args) {
        SortLinkedList1 sortLinkedList1 = new SortLinkedList1();
        Node root = sortLinkedList1.createLinkedList1();
        sortLinkedList1.sortList(root);
        //  sortLinkedList1.printList(n);
    }

    private void sortList(Node root) {
        if (root == null) {
            return;
        }
        Node n = root;
        Node sorted = n;
        Node toBeSorted = n.next;
        while (toBeSorted != null) {
            if (sorted.data > toBeSorted.data) {
                sorted.next = toBeSorted.next;
                toBeSorted.next = n;
                n = toBeSorted;
            } else {
                Node p = sorted;
                while (p!=null && p != toBeSorted) {
                    if (p.data > toBeSorted.data) {
                        p.next = toBeSorted.next;
                        toBeSorted.next = p;
                        sorted.next = toBeSorted;
                    }
                    p = p.next;
                }

            }
            toBeSorted = toBeSorted.next;
        }
        printList(n);
    }



    private Node createLinkedList1() {
      /* Node n8 = new Node(8, null);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);*/
        Node n6 = new Node(6, null);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(7, n5);
        Node n3 = new Node(4, n4);
        Node n2 = new Node(1, n3);
        Node n1 = new Node(2, n2);
        return n1;
    }

    private void printList(Node n) {
        if (n != null) {
            System.out.println(n.data);
            printList(n.next);

        }

    }

}
