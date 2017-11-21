package Practise.practiseid;

//BinarySearchTreeVerificationUsingInorderTraversal
public class BinarySearchTreeVerification {
	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String args[]) {
		BinarySearchTreeVerification bst = new BinarySearchTreeVerification();
		Node n = bst.createBinaryTree();

		boolean flag = bst.checkIfBinarySearch(n, Integer.MIN_VALUE,
				Integer.MAX_VALUE);
		System.out.print(flag);
	}

	private boolean checkIfBinarySearch(Node n, int min, int max) {

		if (n == null) {
			return true;
		}

		if (n != null) {
			return checkIfBinarySearch(n.left, min, n.data)
					&& (n.data > min && n.data <= max)
					&& checkIfBinarySearch(n.right, n.data, max);

		}

		return false;
	}

	private Node createBinaryTree() {
		Node n7 = new Node(6);
		Node n6 = new Node(8);
		Node n5 = new Node(7);
		Node n4 = new Node(4);
		Node n3 = new Node(3);
		Node n2 = new Node(5);
		Node n1 = new Node(1);
		n5.left = n7;
		n4.left = n3;
		n4.right = n5;
		n5.right = n6;
		n3.left = n1;
		n3.right = null;
		n1.left = null;
		n1.right = n2;
		n6.left = null;
		n6.right = null;
		n2.left = null;
		n2.right = null;

		return n4;
	}
}
