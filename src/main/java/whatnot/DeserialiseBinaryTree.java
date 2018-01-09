package whatnot;

public class DeserialiseBinaryTree {


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
        DeserialiseBinaryTree deserialiseBinaryTree=new DeserialiseBinaryTree();
String stream="1 ,2 ,4 ,$ ,$ ,$ ,3 ,5 ,$ ,$ ,6 ,$ ,$ ";
for(int i=0;i<stream.length();i++) {
    deserialiseBinaryTree.deserialise(deserialiseBinaryTree.root,stream.charAt(i));
}
    }
private Node root=null;
    private void deserialise(Node root,Character ch) {

         root=new Node(ch,null,null);


       // deserialise(root.left);
      //  deserialise(root.right);
    }
}
