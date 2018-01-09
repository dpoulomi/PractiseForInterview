package whatnot;

public class LengthOfConnectingPath {

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
        LengthOfConnectingPath lengthOfConnectingPath = new LengthOfConnectingPath();

        Node root = lengthOfConnectingPath.createTree1();

        Node LCA = lengthOfConnectingPath.getLength(root, root, root.right.right);
        int d = lengthOfConnectingPath.findDiff(LCA, root, root.right.right);
        System.out.println(d);

    }

    private int findDiff(Node lca, Node n1, Node n2) {
        int d1 = getDepth(lca, n1);
        int d2 = getDepth(lca, n2);
        if (d1 > d2) {
            return d1 - d2;
        } else {
            return d2 - d1;
        }

    }

    private Node n = null;

    private Node getLength(Node head, Node n1, Node n2) {
        if (head == null) {
            return null;
        }
        if (head.data == n1.data) {

            n = n1;
            return n;
        }
        if (head.data == n2.data) {
            n = n2;
            return n;
        }

        Node left = getLength(head.left, n1, n2);
        Node right = getLength(head.right, n1, n2);

        if (left != null && right != null) {
            return n;
        }

        return left != null ? left : right;
    }


    private int getDepth(Node lca, Node n1) {
        if (lca == null) {
            return 0;
        }
        int depth=0;
        if (lca.data == n1.data) {
           return depth+1;
        }

int left=getDepth(lca.left,n1);
        if(left==0){
          left=getDepth(lca.right,n1);
        }
        return  left+1;
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
