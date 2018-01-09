package whatnot.Practise.practiseid;


public class PrintBinaryTreeLevelByLevel {

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
		PrintBinaryTreeLevelByLevel rll = new PrintBinaryTreeLevelByLevel();
		Node n1 = rll.createTree1();
		rll.printList(n1);
		int h = getHeight(n1);
		System.out.println();
		for(int i=1;i<=h;i++){
			rll.printBinaryTreeLevelByLevel(n1, i);
		}
		
		System.out.println();

	}

	private static int getHeight(Node n1) {
		if (n1 == null) {
			return 0;
		}
		int l = getHeight(n1.left);
		int r = getHeight(n1.right);
		int height = 0;
		if (l > r) {
			height = l;
		} else {
			height = r;
		}
		return height + 1;
	}

	private void printBinaryTreeLevelByLevel(Node n1, int height) {
		if(n1 == null) {
			return;
		}
		if (height == 1) {
			System.out.print(n1.data +"  ");
		}
		if (height > 1) {
			printBinaryTreeLevelByLevel(n1.left, height-1);
			printBinaryTreeLevelByLevel(n1.right, height-1);
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
		Node n12 = new Node(12, null, null);
		Node n11 = new Node(13, null, null);
		Node n10 = new Node(2, null, null);

		Node n9 = new Node(2, null, n12);
		Node n8 = new Node(1, null, null);

		Node n7 = new Node(11, n10, n11);
		Node n6 = new Node(9, null, null);
		Node n5 = new Node(7, null, null);
		Node n4 = new Node(5, n8, n9);
		Node n3 = new Node(10, n6, n7);
		Node n2 = new Node(6, n4, n5);
		Node n1 = new Node(8, n2, n3);
		return n1;
	}

}
