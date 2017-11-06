
public class VerifyBinarySearchTreePreorder {

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
		Node n6 = new Node(12, null, null);
		Node n7 = new Node(16, null, null);
		Node n4 = new Node(4, null, null);
		Node n5 = new Node(8, null, null);
		Node n2 = new Node(6, n4, n5);
		Node n3 = new Node(14, n6, n7);
		Node n1 = new Node(10, n2, n3);
		return n1;
	}

	public static void main(String args[]) {
		VerifyBinarySearchTreePreorder bs = new VerifyBinarySearchTreePreorder();
		Node n = bs.createTree();
		// bs.preorder(n);
		// int count=bs.getHeight(n);
		// System.out.println(count);
		boolean flag = bs.verifyBinaryTree(n);
		System.out.print(flag);
	}

	private boolean verifyBinaryTree(Node n) {
		if(n==null){
			return true;
		}
		if (n != null && n.left!=null && n.right!=null ) {
			if (n.data < n.left.data && n.data > n.right.data) {
				return false;
			}
	}
		
		return verifyBinaryTree(n.left) && verifyBinaryTree(n.right);
}
}