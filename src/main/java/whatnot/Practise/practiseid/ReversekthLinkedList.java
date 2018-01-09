package whatnot.Practise.practiseid;

public class ReversekthLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		ReversekthLinkedList rll = new ReversekthLinkedList();
		Node n = rll.createlist();
		int k = 3;
		rll.printList(n);
		System.out.println();
		Node n1;
		try {
			n1 = rll.reverseLinkedList(n, k);
			rll.printList(n1);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Node reverseLinkedList(Node head, int k) throws Exception {
		Node node1 = head;
		Node preversedNode = null;
		Node previous = null;
		while (node1 != null) {
			Node node2 = node1;
			Node pNext = null;
			for (int i = 1; node2.next != null && i < k; i++) {
				node2 = node2.next;
				pNext = node2.next;
			}
			reverseGroup(node1, node2);
			if (preversedNode == null) {
				preversedNode = node2;
			}
			if (previous != null) {
				previous.next = node2;
			}
			previous = node1;
			node1 = pNext;
		}
		return preversedNode;
	}

	private void reverseGroup(Node node1, Node node2) {
		Node previous = null;
		Node next = null;
		while (node1 != node2) {
			next = node1.next;
			node1.next = previous;
			previous = node1;
			node1 = next;
		}
		node1.next = previous;
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.print(n.data + "->");
			printList(n.next);
		}
	}

	private Node createlist() {
		/*
		 * Node n11 = new Node(11, null); Node n10 = new Node(10, n11); Node n9
		 * = new Node(9, n10); Node n8 = new Node(8, n9); Node n7 = new Node(7,
		 * n8); Node n6 = new Node(6, n7); Node n5 = new Node(5, n6);
		 */
		Node n4 = new Node(4, null);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		return n1;
	}

}
