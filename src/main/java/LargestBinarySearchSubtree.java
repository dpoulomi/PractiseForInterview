public class LargestBinarySearchSubtree {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int element, Node lft, Node rt) {
			data = element;
			left = lft;
			right = rt;
		}
	}
	public Node createTree() {
		Node n6 = new Node(112, null, null);
		Node n7 = new Node(116, null, null);
		Node n4 = new Node(5, null, null);
		Node n5 = new Node(81, null, null);
		Node n2 = new Node(6, n4, n5);
		Node n3 = new Node(114, n6, n7);
		Node n1 = new Node(100, n2, n3);
		return n1;
	}

	public static void main(String args[]) {
		LargestBinarySearchSubtree bs = new LargestBinarySearchSubtree();
		Node n = bs.createTree();
		Node binarySearchSubTree=bs.getLargestBinartySearchSubTree(n);
		bs.printList(binarySearchSubTree);
	
	}
	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.data);

			printList(n.left);
			printList(n.right);
		}
	
	
	}

	private  Node getLargestBinartySearchSubTree(Node n) {
	boolean flag=checkBinarySearchTree(n);
	if(flag){
		
		
	}
		return null;
	}

	private boolean checkBinarySearchTree(Node n) {
	if(n==null){
		return true;
	}	
		Node left=n.left;
		Node right=n.right;
		if(n.data>left.data && n.data<right.data){
		return false;
		}
		return checkBinarySearchTree(n.left) && checkBinarySearchTree(n.right);
	}


	
}


