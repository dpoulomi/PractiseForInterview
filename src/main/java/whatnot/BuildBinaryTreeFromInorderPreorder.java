package whatnot;

public class BuildBinaryTreeFromInorderPreorder {

    public class Node {
        int data;
        Node left = null;
        Node right = null;

        public Node(final int value, Node left, final Node right) {
            data = value;
            this.left = left;

            this.right = right;
        }

    }
private int proderIndex=0;


    public static void main(String[] args) {
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int start = 0;
        int end = preorder.length;

        BuildBinaryTreeFromInorderPreorder buildBinaryTreeFromInorderPreorder = new BuildBinaryTreeFromInorderPreorder();
       Node n= buildBinaryTreeFromInorderPreorder.buildTree(inorder, preorder, start, end);
       buildBinaryTreeFromInorderPreorder.printList(n);
    }

    private void printList(Node tree) {
        if (tree != null) {
            printList(tree.left);
            System.out.print(tree.data + "--->");
            printList(tree.right);
        }
    }


    private Node buildTree(int[] inorder, int[] preorder, int start, int end) {
        Node root = null;
        if (start > end) {
            return null;
        }
        if (proderIndex < preorder.length) {
            root = new Node(preorder[proderIndex], null, null);
            proderIndex++;
            if (start == end) {
                return root;
            }

            for (int i = 0; i < inorder.length; i++) {
                if (root.data == inorder[i]) {
                    root.left = buildTree(inorder, preorder, start, i - 1);
                    root.right = buildTree(inorder, preorder, i + 1, end);

                }

            }
        }
        return root;
    }
}
