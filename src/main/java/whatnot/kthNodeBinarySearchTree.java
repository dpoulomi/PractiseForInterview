package whatnot;

public class kthNodeBinarySearchTree {


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

  //  private static int k = 3;

    public static void main(String[] args) throws Exception {
int k=3;
        kthNodeBinarySearchTree kthNodeBinarySearchTree = new kthNodeBinarySearchTree();
        Node tree = kthNodeBinarySearchTree.createTree1();
        kthNodeBinarySearchTree.printList(tree);
        System.out.println();
      Node kthnode=kthNodeBinarySearchTree.findKthNode(k, tree);
        System.out.println(kthnode.data);
    }



    private Node findKthNode(int k, Node tree) {
         Node target = null;
        if(tree.left != null)
            target = findKthNode(k,tree.left);
        if(target == null) {
            if(k == 1) {
                target = tree;
            }
            k--; }
        if(target == null && tree.right != null)
            target = findKthNode(k,tree.right);
        return target;
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
