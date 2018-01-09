package whatnot;

public class DepthOfBinaryTree {


    public class Node {
        int data;
        Node left = null;
        Node right = null;

        public Node(int value, Node left, Node right) {
            data = value;
            this.left = left;
            this.right = right;
        }

    }


    public static void main(String[] args) throws Exception {

        DepthOfBinaryTree depthOfBinaryTree = new DepthOfBinaryTree();
        Node tree = depthOfBinaryTree.createTree1();
        depthOfBinaryTree.printList(tree);
        System.out.println();
        System.out.println(depthOfBinaryTree.findDepth(tree));

    }

    private int findDepth(Node tree) {
        if (tree == null) {
            return 0;
        }

        int left = findDepth(tree.left);
        int right = findDepth(tree.right);

        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }

    }


    private Node createTree1() {
        Node n9 = new Node(14, null, null);
        Node n8 = new Node(12, n9, null);
        Node n7 = new Node(11, null, n8);
        Node n6 = new Node(9, null, null);
        Node n5 = new Node(7, null, null);
        Node n4 = new Node(5, null, null);
        Node n3 = new Node(10, n6, n7);
        Node n2 = new Node(6, n4, n5);
        Node n1 = new Node(8, n2, n3);
        return n1;
    }


    private void printList(Node tree) {
        if (tree != null) {
            printList(tree.left);
            System.out.print(tree.data + "--->");
            printList(tree.right);
        }
    }
}
