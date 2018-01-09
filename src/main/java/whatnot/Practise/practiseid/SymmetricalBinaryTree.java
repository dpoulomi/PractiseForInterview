package whatnot.Practise.practiseid;


public class SymmetricalBinaryTree {

	public class Node {
		int data;
		Node left;
		Node right;

		public Node(int value, Node left, Node right) {
			data = value;
			this.left = left;

			this.right = right;
		}
	}

	public static void main(String args[]) {
		SymmetricalBinaryTree rll = new SymmetricalBinaryTree();
		Node n1 = rll.createTree1();
		rll.printList(n1);
		System.out.println();

		boolean flag = rll.testForSymmetry(n1.left, n1.right);
		System.out.println(flag);
	}

	private boolean testForSymmetry(Node left, Node right) {

		if (left == null && right == null) {
			return true;
		}
		if ((left==null && right!=null) || (left!=null && right==null) || left.data != right.data) {
			return false;
		}
		return (testForSymmetry(left.left, right.right) &&
				testForSymmetry(
				left.right, right.left));
	}

	private void printList(Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

	private Node createTree1() {
		Node n11= new Node(1, null, null);
		Node n10 = new Node(2, null, null);
		
		Node n9 = new Node(2, null, null);
		Node n8 = new Node(1, null, null);
		
		Node n7 = new Node(5, n10, n11);
		Node n6 = new Node(7, null, null);
		Node n5 = new Node(7, null, null);
		Node n4 = new Node(5, n8, n9);
		Node n3 = new Node(6, n6, n7);
		Node n2 = new Node(6, n4, n5);
		Node n1 = new Node(8, n2, n3);
		return n1;
	}

}
