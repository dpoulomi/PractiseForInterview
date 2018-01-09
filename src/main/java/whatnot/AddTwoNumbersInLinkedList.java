package whatnot;

public class AddTwoNumbersInLinkedList {


    public class Node {
        int data;
        Node next = null;

        public Node(int value, Node nxt) {
            data = value;
            this.next = nxt;
        }

    }

    private int carry = 0;

    private Node result = null;
    private static Node n1,n2=null;

    public static void main(String[] args) {
        AddTwoNumbersInLinkedList addTwoNumbersInLinkedList = new AddTwoNumbersInLinkedList();
         n1 = addTwoNumbersInLinkedList.createLinkedList1();
         n2 = addTwoNumbersInLinkedList.createLinkedList2();
        addTwoNumbersInLinkedList.addLists(n1, n2);

    }

    private void addLists(Node n1, Node n2) {
        addSameSizeLists(n1, n2);
        if(carry>0){
            createNode(carry,3);
        }
        printList(result);

    }

    private void addSameSizeLists(Node n1, Node n2) {
        if (n1 == null) {
            return;
        }
        addSameSizeLists(n1.next, n2.next);

        int sum = n1.data + n2.data + carry;
        carry = sum / 10;
        sum = sum % 10;

        createNode(sum, 3);



    }

    private void createNode(int sum, int i) {
       Node node=new Node(sum,null);
       if(i==1){
           node.next=n1;
           n1=node;

       }
       else if(i==2){
            node.next=n2;
            n2=node;

        }
        else{
           node.next=result;
           result=node;

       }


    }

    private void printList(Node n) {
        if (n != null) {
            System.out.println(n.data);
            printList(n.next);

        }

    }

    /*private void addLists(Node n1, Node n2) {
        String num1 = "";
        String num2 = "";
        while (n1 != null){
            num1 = String.valueOf(n1.data)+num1;
            n1=n1.next;


        } while(n2!= null) {

            num2 = String.valueOf(n2.data)+num2;
            n2=n2.next;
        }

        int sum = Integer.valueOf(num1)+Integer.valueOf(num2);
        System.out.println(sum);
    }*/

    private Node createLinkedList1() {
      /* Node n8 = new Node(8, null);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);*/
         Node n3 = new Node(2, null);
        Node n2 = new Node(4, n3);
        Node n1 = new Node(8, n2);
        return n1;
    }

    private Node createLinkedList2() {
     /*   Node n8 = new Node(8, null);
        Node n7 = new Node(7, n8);
        Node n6 = new Node(6, n7);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);*/
      //  Node n5 = new Node(6, null);
     //   Node n4 = new Node(4, n5);
        Node n3 = new Node(9, null);
        Node n2 = new Node(5, n3);
        Node n1 = new Node(7, n2);
        return n1;
    }
}
