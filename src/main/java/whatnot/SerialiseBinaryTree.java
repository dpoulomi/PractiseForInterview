package whatnot;

public class SerialiseBinaryTree {

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
        SerialiseBinaryTree serialiseBinaryTree=new SerialiseBinaryTree();
        Node root=serialiseBinaryTree.createTree1();
        serialiseBinaryTree.serialise(root);
    }

    private void serialise(Node root) {

        if(root==null){
            System.out.print("$ ,");
            return;

        }
        System.out.print(root.data +" ,");
        serialise(root.left);
        serialise(root.right);
    }

    private Node createTree1() {
        Node n7 = new Node(6, null, null);
        Node n6 = new Node(5, null, null);
        Node n5 = new Node(7, null, null);
        Node n4 = new Node(4, null, null);
        Node n3 = new Node(3, n6, n7);
        Node n2 = new Node(2, n4, null);
        Node n1 = new Node(1, n2, n3);
        return n1;
    }
}
