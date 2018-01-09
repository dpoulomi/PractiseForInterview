package whatnot;

public class SymmetricalBinaryTree {



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
        SymmetricalBinaryTree symmetricalBinaryTree = new SymmetricalBinaryTree();
        Node tree = symmetricalBinaryTree.createTree1();
        symmetricalBinaryTree.printList(tree);
        System.out.println();
        if(tree!=null) {
            Node left = tree.left;
            Node right = tree.right;
            boolean isSymmtrical=  symmetricalBinaryTree.checkIfSymmetrical(left,right);
            System.out.println(isSymmtrical);
        }


    }

    private boolean checkIfSymmetrical(Node left,Node right) {
        if(left==null && right==null) {
            return  true;
        }
        if(left==null || right==null) {
            return  true;
        }

            if (left.data != right.data) {
                return false;
            }


return checkIfSymmetrical(left.right,right.left) && checkIfSymmetrical(left.left,right.right);
    }




    private Node createTree1() {
        Node n7 = new Node(5, null, null);
        Node n6 = new Node(7, null, null);
        Node n5 = new Node(7, null, null);
        Node n4 = new Node(5, null, null);
        Node n3 = new Node(6, n6, n7);
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
