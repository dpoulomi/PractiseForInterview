package whatnot;

public class LCA {


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
        LCA lca = new LCA();
        Node tree = lca.createTree1();
        System.out.println(lca.findLowestCommonAncestor(tree, tree.left.left, tree.right.right).data);

    }

    private Node n = null;



    private Node findLowestCommonAncestor(Node tree, Node n1, Node n2) {
        if (tree == null) {
            return null;
        }
        if (tree.data == n1.data) {
            n=tree;
           return n;
        }
        if (tree.data == n2.data) {
            n=tree;
           return n;
        }

        Node    left = findLowestCommonAncestor(tree.left, n1, n2);
          Node  right = findLowestCommonAncestor(tree.right, n1, n2);


        if (left != null && right != null) {
            return n;

        }
        return (left != null) ? left : right;
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


    private void printList(Node tree) {
        if (tree != null) {
            printList(tree.left);
            System.out.print(tree.data + "--->");
            printList(tree.right);
        }
    }

}
