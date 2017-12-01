package Practise.practiseid;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*Given a binary tree and an integer value, please print all paths where the sum of node values
 equals the given integer. All nodes from the root node to a leaf node compose a path.
 For example, given the binary tree in Figure 6-12, there are two paths with sum 22, of which one contains two
 nodes with values 10 and 12, and the other contains three nodes with values 10, 5, and 7.*/
public class PrintPathsForNodesEqualInteger {

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
		PrintPathsForNodesEqualInteger rll = new PrintPathsForNodesEqualInteger();
		Node n1 = rll.createTree1();
		// rll.printList(n1);
		int number = 22;
		int sum = 0;
		rll.findPaths(n1, sum, number);
		System.out.println();
		/*
		 * for (Node n : path) { System.out.println(n.data + "-->"); }
		 */

	}

	private static List<Node> path = new ArrayList<>();

	private void findPaths(Node n1, int sum, int number) {
		if (n1 == null) {
			return;
		}
		boolean leaf = n1.left == null && n1.right == null;
		sum = sum + n1.data;
		path.add(n1);
		if (sum == number && leaf) {
			for (Node n : path) {
				System.out.println(n.data + "+");
			}
			System.out.println();
		}
		if (n1.left != null) {
			findPaths(n1.left, sum, number);
		}
		if (n1.right != null) {
			findPaths(n1.right, sum, number);
		}
		path.remove(n1);

	}

	private void printlevel(Queue<Node> queue) {
		while (!queue.isEmpty()) {
			System.out.print(queue.poll());
		}
		System.out.println();
	}

	private void printList(Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

	private Node createTree1() {
		Node n7 = new Node(7, null, null);
		Node n6 = new Node(6, null, null);
		Node n5 = new Node(7, null, null);
		Node n4 = new Node(4, null, null);
		Node n3 = new Node(12, n6, n7);
		Node n2 = new Node(5, n4, n5);
		Node n1 = new Node(10, n2, n3);
		return n1;
	}

}
