package whatnot;

public class SubstructureInTrees {

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

    public static void main(String[] args) {
        SubstructureInTrees substructureInTrees = new SubstructureInTrees();
        Node tree1 = substructureInTrees.createTree1();
        Node tree2 = substructureInTrees.createTree2();
        System.out.print(substructureInTrees.checkIfSubTree(tree1, tree2));

    }

    private boolean checkIfSubTree(Node tree1, Node tree2) {

        boolean result = false;
        if (tree1 != null && tree2 != null) {
            if (tree1.data == tree2.data) {
                result = checkIfNodesMatch(tree1, tree2);
            }
            if (!result) {
                result = checkIfSubTree(tree1.left, tree2);
            }
            if (!result) {
                result = checkIfSubTree(tree1.right, tree2);
            }
        }
        return result;
    }

    private boolean checkIfNodesMatch(Node tree1, Node tree2) {
        if (tree2 == null) {
            return true;
        }
        if (tree1 == null) {
            return false;
        }
        if (tree1.data != tree2.data) {
            return false;
        }
        return checkIfNodesMatch(tree1.left, tree2.left) && checkIfNodesMatch(tree1.right, tree2.right);
    }

    private Node createTree1() {
        Node n7 = new Node(7, null, null);
        Node n6 = new Node(6, null, null);
        Node n5 = new Node(5, null, null);
        Node n4 = new Node(4, null, null);
        Node n3 = new Node(3, n6, n7);
        Node n2 = new Node(2, n4, n5);
        Node n1 = new Node(1, n2, n3);
        return n1;
    }

    private Node createTree2() {

        Node n3 = new Node(5, null, null);
        Node n2 = new Node(4, null, null);
        Node n1 = new Node(2, n2, n3);
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
