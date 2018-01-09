package whatnot;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesLevelByLevel {


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
        BinaryTreesLevelByLevel binaryTreesLevelByLevel = new BinaryTreesLevelByLevel();
        Node tree = binaryTreesLevelByLevel.createTree1();
      //  binaryTreesLevelByLevel.printList(tree);
        binaryTreesLevelByLevel.printLevelByLevel(tree);

    }

    private void printLevelByLevel(Node tree) {

        if (tree == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(tree);
        int nextLevel=0;
        int presentLevel=1;
        while (queue.size() > 0) {
            Node node = queue.peek();
            System.out.print(node.data);
            queue.poll();
            presentLevel--;

            if (node.left != null) {
                queue.add(node.left);
                nextLevel++;

            }
            if (node.right != null) {
                queue.add(node.right);
                nextLevel++;
            }
            if(presentLevel==0){
                System.out.println();
                presentLevel=nextLevel;
                nextLevel=0;
            }
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


    private void printList(Node tree) {
        if (tree != null) {
            printList(tree.left);
            System.out.print(tree.data + "--->");
            printList(tree.right);
        }
    }

}
