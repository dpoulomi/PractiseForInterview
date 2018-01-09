package whatnot;

public class DeleteDuplicatesFromLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		DeleteDuplicatesFromLinkedList rll = new DeleteDuplicatesFromLinkedList();
		Node n = rll.createlist();
		rll.printList(n);
		System.out.println();
		Node n1 = rll.deleteDuplicates(n);
		rll.printList(n1);
	}

	private Node deleteDuplicates(Node head) {
		Node prev = null;
		Node it = head;
		boolean dupPresent = false;
		while (it != null && it.next != null) {
			while (it.next != null && it.data == it.next.data) {
				it = it.next;
				dupPresent = true;
			}
			if (dupPresent && prev == null) {
				head = it.next;
			} else if(dupPresent) {
				prev.next = it.next;
			} else {
				prev = it;
			}
			
			it = it.next;
			dupPresent = false;
		}
		return head;

	}

	private void printList(Node n) {
		if (n != null) {
			System.out.print(n.data + "->");
			printList(n.next);
		}
	}

	private Node createlist() {
		Node n7 = new Node(5, null);

		Node n6 = new Node(4, n7);
		Node n5 = new Node(1, n6);
		/*Node n4 = new Node(3, n5);

		Node n3 = new Node(3, n4);*/
	//	Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n5);
		return n1;
	}

}
