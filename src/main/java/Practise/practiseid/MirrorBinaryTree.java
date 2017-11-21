package Practise.practiseid;

public class MirrorBinaryTree {

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
		MirrorBinaryTree rll = new MirrorBinaryTree();
		Node n1 = rll.createTree1();
		rll.printList(n1);
		System.out.println();
		Node n2 = n1;
		Node mainTree = n1;
		// Node mirrorTree=new MirrorBinaryTree().new Node(n2.data, n2.right,
		// n2.left);
		rll.formMirrorTree(mainTree);
		rll.printList(n2);
		System.out.println();

	}

	private void formMirrorTree(Node head) {
		if (head == null) {
			return;
		}
		if (head.left != null || head.right != null) {
			Node temp = head.left;
			head.left = head.right;
			head.right = temp;
			formMirrorTree(head.right);
			formMirrorTree(head.left);
		}
	}

	private void printList(Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

	private Node createTree1() {
		/*Node n9 = new Node(20, null, null);
		Node n8 = new Node(19, null, n9);
		Node n7 = new Node(11, n8, null);
		Node n6 = new Node(9, null, null);
		Node n5 = new Node(7, null, null);
		Node n4 = new Node(5, null, null);*/
		Node n3 = new Node(10, null, null);
		Node n2 = new Node(6, null, null);
		Node n1 = new Node(8, n2, n3);
		return n1;
	}

}
