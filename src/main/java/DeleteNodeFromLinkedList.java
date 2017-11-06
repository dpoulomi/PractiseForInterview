
public class DeleteNodeFromLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		DeleteNodeFromLinkedList rll = new DeleteNodeFromLinkedList();
		Node n = rll.createlist();
		// rll.printList(n);
		Node n1 = rll.deleteNodeFromList(n, n.next.next);
		rll.printList(n1);
	}

	private Node createlist() {
		Node n4 = new Node(15, null);
		Node n3 = new Node(20, n4);
		Node n2 = new Node(30, n3);
		Node n1 = new Node(10, n2);
		return n1;
	}

	private Node deleteNodeFromList(Node n, Node nodeToDelete) {
		Node temp = n;
		if (n == null) {
			return n;
		}
		// while(temp!=nodeToDelete){
		while (temp != null) {
			if (temp.next == nodeToDelete) {
				Node nxt = temp.next.next;
				temp.next = nxt;
				break;
			}
			/*
			 * Node afterDeletionNodes=temp.next; //temp=null;
			 * temp.next=afterDeletionNodes;
			 */

			temp = temp.next;
		}
		return temp;
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.data);

			printList(n.next);
		}
	}
}
