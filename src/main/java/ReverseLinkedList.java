public class ReverseLinkedList {
	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		ReverseLinkedList rll = new ReverseLinkedList();
		Node n = rll.createlist();
		Node n1 = rll.reverseList(n);
		rll.printList(n1);
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.data);

			printList(n.next);
		}
	}

	private Node reverseList(Node n) {
		/*
		 * while(n.next!=null){ current = n.next; previous=current.next;
		 * previous.next=current; current.next=n; //n.next=nxt; nxt = n;
		 * //if(next.next!=null){ // reverseList(current); //} } return current;
		 */
		Node current = null;
		Node nxt = null;
		Node previous = null;
		current=n;
		while (current != null) {
			nxt=current.next;
			current.next=previous;
			previous=current;
			current	=nxt;
			
		}
		n = previous;
		return n;

	}

	private Node createlist() {
		Node n3 = new Node(30, null);
		Node n2 = new Node(20, n3);
		Node n1 = new Node(10, n2);
		return n1;
	}

}
