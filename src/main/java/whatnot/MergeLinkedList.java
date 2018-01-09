package whatnot;

public class MergeLinkedList {
    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    public static void main(String[] args) {
        MergeLinkedList mergeLinkedList = new MergeLinkedList();
        Node n1 = mergeLinkedList.createLinkedList1();
        Node n2 = mergeLinkedList.createLinkedList2();
        Node n = mergeLinkedList.mergeList(n1, n2);
mergeLinkedList.printList(n);
    }

    private Node createLinkedList2() {
        Node n4 = new Node(6, null);
        Node n3 = new Node(5, n4);
        Node n2 = new Node(3, n3);
        Node n1 = new Node(2, n2);
        return n1;
    }

    private Node createLinkedList1() {

        Node n6 = new Node(9, null);
        Node n5 = new Node(8, n6);
        Node n3 = new Node(7, n5);
        Node n2 = new Node(4, n3);
        Node n1 = new Node(1, n2);
        return n1;
    }

    private Node mergeList(Node n1, Node n2) {
        //1,4,7,8,9
        //2,3,5,6
        Node root = null;
        Node head = null;
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        if (n1 == null && n2 == null) {
            return null;
        }

        while (n1 != null && n2 != null) {
            if (n1.data < n2.data) {
                if (root == null) {
                    root = new Node(n1.data, null);
                    head = root;
                    n1 = n1.next;
                } else {
                    root.next = new Node(n1.data, null);
                    root=root.next;
                    n1 = n1.next;
                }
            } else {
                if (root == null) {
                    root = new Node(n2.data, null);
                    head = root;
                    n2 = n2.next;
                } else {
                    root.next = new Node(n2.data, null);
                    root=root.next;
                    n2 = n2.next;
                }

            }

        }
        if (n1 != null) {
            root.next = n1;
            n1 = n1.next;
        }
        if (n2 != null) {
            root.next = n2;
            n2 = n2.next;
        }
        return head;
    }


    private void printList(Node n) {
        if (n != null) {
            System.out.println(n.data);
            printList(n.next);
        }
    }
}
