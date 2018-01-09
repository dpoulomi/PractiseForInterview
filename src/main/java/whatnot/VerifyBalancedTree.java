package whatnot;

public class VerifyBalancedTree {


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

        VerifyBalancedTree verifyBalancedTree = new VerifyBalancedTree();
        Node tree = verifyBalancedTree.createTree1();
        verifyBalancedTree.printList(tree);
        System.out.println();
        int depth = 0;
        System.out.println(verifyBalancedTree.verifyBalancedTree(tree, depth));

    }

    private boolean verifyBalancedTree(Node tree, int depth) {

        boolean flag = false;
        if (tree == null) {

            depth = 0;
            return true;

        }
        int left = 0, right = 0;
        if (verifyBalancedTree(tree.left, left) && verifyBalancedTree(tree.right, right)) {
            int diff = left - right;
            if (diff <= 1 || diff >= -1) {
                depth = 1 + left > right ? left : right;
                return true;
            }

        }
        return false;
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
