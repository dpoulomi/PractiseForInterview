
public class PostOrderTraversalforBinarySearchTree {

	/*Please check whether it is possible for an array to be the post-order traversal sequence of a
	binary search tree. All numbers in the input array are unique.
	For example, the array {5, 7, 6, 9, 11, 10, 8} is the post-order traversal sequence of the binary search tree in
	Figure 6-16. However, there is not a binary search tree whose post-order traversal sequence is {7, 4, 6, 5}.*/
	
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

	public static void main(final String args[]) {
		  PostOrderTraversalforBinarySearchTree rll = new PostOrderTraversalforBinarySearchTree();
		  int postOrderSequence[]={5, 7, 6,11,9, 10, 8};
		  int start=0;
		  int end =postOrderSequence.length-1;
		boolean isBinarySearchTree=  rll.checkBinaryTree(postOrderSequence,start, end);
		System.out.println(isBinarySearchTree);
	}

	private boolean checkBinaryTree(int[] postOrderSequence, int start, int end) {
		Node root = new Node(postOrderSequence[end], null, null);
		int i = start;
		for (i = start; i < end; i++) {
			if (postOrderSequence[i] > root.data) {
				break;
			}
		}
		while (i < end) {
			if (postOrderSequence[i] < postOrderSequence[end]) {
				return false;
			}
			i++;
		}
		boolean left=true;
		boolean right=true;
		if(i>0){
		 left=checkBinaryTree(postOrderSequence, start, i-1);
		}
		if(i<end){
         right=checkBinaryTree(postOrderSequence, i, end);
		}
		return left && right;
	}
	
}