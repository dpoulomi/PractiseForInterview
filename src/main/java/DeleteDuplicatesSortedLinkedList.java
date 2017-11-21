//Given a sorted linked list, please delete all duplicated numbers and leave only distinct numbers
//from the original list. For example, when the duplicated numbers in the list in Figure 5-4(a) are removed, it
//becomes the list in Figure 5-4(b).
public class DeleteDuplicatesSortedLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		DeleteDuplicatesSortedLinkedList rll = new DeleteDuplicatesSortedLinkedList();
		Node n = rll.createlist();
		rll.printList(n);
		Node n1 = rll.deleteDuplicates(n);
		rll.printList(n1);
	}

	/*
	 * private Node deleteDuplicates(Node n) { Node head = n; Node previous =
	 * head; while (head != null) { while (head != null && head.next != null &&
	 * head.data == head.next.data) { if (previous == head) { previous =
	 * head.next.next; // n = previous; } else { previous.next = head.next.next;
	 * previous = previous.next; } head = head.next;
	 * 
	 * } if (head != null && head.next != null && head.next.next != null &&
	 * head.data != head.next.data && head.next.data != head.next.next.data) {
	 * if (previous != head.next) { previous.next = head.next; previous =
	 * previous.next; } } head = head.next; } return n; }
	 */

	private Node deleteDuplicates(Node head) {
		Node previous = null;
		Node iterativeNode = head;
		boolean needDelete = false;
		while (iterativeNode != null && iterativeNode.next != null) {
			while (iterativeNode.next != null
					&& iterativeNode.data == iterativeNode.next.data) {
				iterativeNode = iterativeNode.next;
				needDelete = true;
			}
			if (needDelete && previous != null) {

				previous.next = iterativeNode.next;
			} else if (needDelete && previous == null) {

				head = iterativeNode.next;
				// previous=head;
			} else {
				previous = iterativeNode;

			}
			iterativeNode = iterativeNode.next;
			needDelete = false;
		}
		return head;
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.data);

			printList(n.next);
		}
	}

	private Node createlist() {
		Node n7 = new Node(5, null);

		Node n6 = new Node(4, n7);
		Node n5 = new Node(1, n6);
		/*
		 * Node n4 = new Node(3, n5);
		 * 
		 * Node n3 = new Node(3, n4);
		 */
		// Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n5);
		return n1;
	}

}
