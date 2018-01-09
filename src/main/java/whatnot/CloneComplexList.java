package whatnot;

public class CloneComplexList {


    class Node {
        char data;
        Node next = null;
        Node arbit = null;

        public Node(char value, Node nxt) {
            data = value;
            this.next = nxt;
            this.arbit=null;
        }


    }

    public static void main(String[] args) {
        CloneComplexList cloneComplexList = new CloneComplexList();
        Node list = cloneComplexList.createLinkedList1();
        cloneComplexList.printList(list);
        System.out.println();
        System.out.println();
        Node clonedlist = cloneComplexList.clonelist(list);

        cloneComplexList.printList(clonedlist);

    }

    private Node clonelist(Node list) {
        Node originalList = list;
        Node cloneList = null;

        while (originalList != null) {
            Node temp = originalList.next;
            originalList.next = new Node(originalList.data, temp);
            originalList = temp;

        }
        originalList = list;
        while (originalList != null) {
            if (originalList.next!=null && originalList.arbit != null) {
                originalList.next.arbit = originalList.arbit.next;
            }
            originalList = originalList.next.next;
        }

        originalList = list;
        cloneList = originalList.next;
        Node temp=cloneList;
        while (originalList != null) {
            originalList.next = originalList.next.next;
            cloneList.next = originalList.next;
           originalList=originalList.next;
           cloneList=cloneList.next;
        }

        return temp;
    }

    private void printList(Node linkedList) {
        while (linkedList != null) {
            System.out.print(linkedList.data + "--->");
            linkedList = linkedList.next;
        }
    }


    private Node createLinkedList1() {

        Node n5 = new Node('e', null);
        Node n4 = new Node('d', n5);
        Node n3 = new Node('c', n4);
        Node n2 = new Node('b', n3);
        Node n1 = new Node('a', n2);
        n1.arbit=n3;
        n2.arbit=n5;
        n4.arbit=n2;
        return n1;
    }
}
