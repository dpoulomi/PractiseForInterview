package whatnot;

public class ValidatePostOrderTraversal {

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

        int postorder[] = {5, 7, 6, 9, 11, 10, 8};
        int start=0;
        int length = postorder.length - 1;
        ValidatePostOrderTraversal validatePostOrderTraversal = new ValidatePostOrderTraversal();
        System.out.println(validatePostOrderTraversal.validate(postorder, start,length));
    }


    private boolean validate(int[] postorder,int start, int length) {
        int root = postorder[length];
        int i = 0;
        for (i = 0; i < length; i++) {
            if (postorder[i] > root) {
                break;
            }
        }
        for (int j = i; j < length; j++) {
            if (postorder[j] < root) {
                return false;
            }
        }
        boolean left = true;
        if (i > 0) {
            left = validate(postorder,start,i-1);
        }
        boolean right = true;
        if (i < length) {
            right = validate(postorder, i,length);
        }
        return (left && right);
    }


}
