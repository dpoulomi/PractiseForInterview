package Practise.practiseid;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class PrintBinaryTreeLevelByLevelWithStack {

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
		PrintBinaryTreeLevelByLevelWithStack rll = new PrintBinaryTreeLevelByLevelWithStack();
		Node n1 = rll.createTree1();
		rll.printList(n1);
		System.out.println();
		// rll.printBinaryTreeLevelByLevel(n1);
		// System.out.println();
		rll.printBinaryTreeLevelByLevelInNewLine(n1);
		System.out.println();
		rll.printinZigZagForm(n1);
	}

	private void printinZigZagForm(Node head) {
		if (head == null)
			return;
		Deque<Node> queue = new LinkedList<Node>();
		boolean reversePop = true;
		int currentNodeCount = 1;
		int nextLevelNodeCount = 0;
		queue.add(head);
		Node tempNode = null;
		while (!queue.isEmpty()) {
			if (!reversePop) {
				tempNode = queue.pollLast();
			} else {
				tempNode = queue.pollFirst();
				// reversePop=false;
			}
			System.out.print(tempNode.data + " ");
			currentNodeCount--;
			if (tempNode.left != null && !reversePop) {
				queue.addFirst(tempNode.left);
				nextLevelNodeCount++;
			}
			if (tempNode.right != null && !reversePop) {
				queue.addFirst(tempNode.right);
				nextLevelNodeCount++;
			}
			if (tempNode.right != null && reversePop) {
				queue.addLast(tempNode.right);
				nextLevelNodeCount++;
			}
			if (tempNode.left != null && reversePop) {
				queue.addLast(tempNode.left);
				nextLevelNodeCount++;
			}

			if (currentNodeCount == 0) {
				reversePop = !reversePop;
				currentNodeCount = nextLevelNodeCount;
				nextLevelNodeCount = 0;
				System.out.println();
			}
		}
	}

	private void printBinaryTreeLevelByLevel(Node n1) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(n1);
		while (!queue.isEmpty()) {

			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	private void printBinaryTreeLevelByLevelInNewLine(Node head) {
		if (head == null)
			return;
		Queue<Node> queue = new LinkedList<Node>();
		Map<Integer, Integer> map = new HashMap<>();
		int currentNodeCount = 1;
		int nextLevelNodeCount = 0;
		queue.add(head);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			currentNodeCount--;
			if (tempNode.left != null) {
				queue.add(tempNode.left);
				nextLevelNodeCount++;
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
				nextLevelNodeCount++;
			}
			if (currentNodeCount == 0) {
				currentNodeCount = nextLevelNodeCount;
				nextLevelNodeCount = 0;
				System.out.println();
			}
		}
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
		Node n21 = new Node(21, null, null);
		Node n20 = new Node(20, null, null);
		Node n18 = new Node(18, n20, n21);
		Node n13 = new Node(16, null, null);
		Node n14 = new Node(17, null, null);
		Node n12 = new Node(12, n13, n14);
		Node n11 = new Node(13, null, null);
		Node n10 = new Node(3, null, null);

		Node n9 = new Node(2, n18, n12);
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
