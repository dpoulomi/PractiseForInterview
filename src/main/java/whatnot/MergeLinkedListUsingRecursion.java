package whatnot;

public class MergeLinkedListUsingRecursion {

    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    public static void main(String[] args) {
        MergeLinkedListUsingRecursion mergeLinkedListUsingRecursion = new MergeLinkedListUsingRecursion();
        Node n1 = mergeLinkedListUsingRecursion.createLinkedList1();
        Node n2 = mergeLinkedListUsingRecursion.createLinkedList2();
        Node n = mergeLinkedListUsingRecursion.mergedList(n1, n2);
        mergeLinkedListUsingRecursion.printList(n);
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

    private Node mergedList(Node n1, Node n2) {
        //1,4,7,8,9
        //2,3,5,6
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        Node mergedList = null;
        if (n1.data < n2.data) {
            mergedList = n1;
            mergedList.next = mergedList(n1.next, n2);
        } else {
            mergedList = n2;
            mergedList.next = mergedList(n1, n2.next);
        }
        return mergedList;
    }


    private void printList(Node n) {
        if (n != null) {
            System.out.println(n.data);
            printList(n.next);
        }
    }
}
