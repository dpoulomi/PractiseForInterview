package whatnot;

public class MirrorTree {


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
        MirrorTree mirrorTree = new MirrorTree();
        Node tree = mirrorTree.createTree1();
        mirrorTree.printList(tree);
        System.out.println();
        mirrorTree.createMirrorTree(tree);
        mirrorTree.printList(tree);

    }

    private void createMirrorTree(Node tree) throws Exception {
        if (tree == null) {
            return;
        }
        if (tree.left == null && tree.right == null) {
            return;
        }
        if (tree != null) {

            if (tree.left != null && tree.right != null) {
                Node temp = tree.left;
                tree.left = tree.right;
                tree.right = temp;

            }
            if (tree.left != null) {
                createMirrorTree(tree.left);
            }
            if (tree.right != null) {
                createMirrorTree(tree.right);
            }

        }


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


    private void printList(Node tree) {
        if (tree != null) {
            printList(tree.left);
            System.out.print(tree.data + "--->");
            printList(tree.right);
        }
    }

}
