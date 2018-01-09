package whatnot;

public class FirstCommonNodeInTwoLinkedList {
    class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }


    }

    public static void main(String[] args) {
        FirstCommonNodeInTwoLinkedList firstCommonNodeInTwoLinkedList = new FirstCommonNodeInTwoLinkedList();
        Node n1 = firstCommonNodeInTwoLinkedList.createLinkedList1();
        Node n2 = firstCommonNodeInTwoLinkedList.createLinkedList2();
        int length1 = firstCommonNodeInTwoLinkedList.findLengthDifference(n1);
        int length2 = firstCommonNodeInTwoLinkedList.findLengthDifference(n2);
        Node intersectingNode = firstCommonNodeInTwoLinkedList.findIntersectingNode(length1, length2, n1, n2);
        System.out.println(intersectingNode.data);

    }

    private Node findIntersectingNode(int length1, int length2, Node n1, Node n2) {
        int diff = 0;
        Node longlist = null;
        Node shortlist = null;
        if (length1 > length2) {
            diff = length1 - length2;
            longlist = n1;
            shortlist = n2;
        } else {
            diff = length2 - length1;
            longlist = n2;
            shortlist = n1;
        }
        while (diff != 0) {
            longlist = longlist.next;
            diff--;
        }
        while (longlist != null && shortlist != null && longlist.data != shortlist.data) {


            longlist = longlist.next;
            shortlist = shortlist.next;
        }

        return longlist;
    }

    private int findLengthDifference(Node n) {
        Node phead = n;
        int countForLis1 = 0;
        while (phead != null) {
            phead = phead.next;
            countForLis1++;
        }
        return countForLis1;
    }

    private Node createLinkedList2() {
        Node n5 = new Node(7, null);
        Node n4 = new Node(6, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        return n1;
    }

    private Node createLinkedList1() {
        Node n4 = new Node(7, null);
        Node n3 = new Node(6, n4);
        Node n2 = new Node(5, n3);
        Node n1 = new Node(4, n2);
        return n1;
    }
}
