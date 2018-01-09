package whatnot;

public class BinarySearchToDoubleLinkedList {

    public class Node {
        int data;
        Node left;
        Node right;


        public Node(final int value, final Node left, final Node right) {
            data = value;
            this.left = left;

            this.right = right;
        }
    }

    public static void main(String[] args) {
        BinarySearchToDoubleLinkedList binarySearchToDoubleLinkedList = new BinarySearchToDoubleLinkedList();
        Node root = binarySearchToDoubleLinkedList.createTree1();
       Node n= binarySearchToDoubleLinkedList.convertToBinaryLinkedList(root);
       binarySearchToDoubleLinkedList.printList(n);
    }

    private Node convertToBinaryLinkedList(Node head) {
        Node root = head;
        Node parent = null;
        Node head1 = null;

        while (root != null) {
            while (root.left != null) {
                Node temp = root.left;
                root.left = temp.right;
                temp.right = root;
                root = temp;
            }
            if (head1 == null) {
                head1 = root;
            }
            parent = root;
            root = root.right;
        }
        Node node1 = head1;
        if (node1 != null) {
            Node node2 = node1.right;
while(node2!=null){
    node2.left=node1;
    node1=node2;
    node2=node2.right;
}

        }
        return head1;
    }

    private void printList(Node tree) {
        if (tree != null) {
            printList(tree.left);
            System.out.print(tree.data + "--->");
            printList(tree.right);
        }
    }

    private Node createTree1() {
        Node n7 = new Node(11, null, null);
        Node n6 = new Node(9, null, null);
        Node n5 = new Node(7, null, null);
        Node n4 = new Node(5, null, null);
        Node n3 = new Node(10, n6, n7);
        Node n2 = new Node(6, n4, n5);
        Node n1 = new Node(8, n2, n3);
        return n1;
    }
}
