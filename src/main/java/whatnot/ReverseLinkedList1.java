package whatnot;

public class ReverseLinkedList1 {


	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		ReverseLinkedList1 rll = new ReverseLinkedList1();
		Node n = rll.createlist();
		rll.printList(n);
		System.out.println();
		Node n1;
		try {
			n1 = rll.reverseLinkedList(n);
			rll.printList(n1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Node reverseLinkedList(Node head) throws Exception {
		if(head==null){
			throw new Exception("No node present to be reversed.");
		}
		if(head.next==null){
			return head;
		}
		Node previous=null;
		Node current=head;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
		
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.print(n.data + "->");
			printList(n.next);
		}
	}

	private Node createlist() {
		/*Node n11 = new Node(11, null);
		Node n10 = new Node(10, n11);
		Node n9 = new Node(9, n10);
		Node n8 = new Node(8, n9);
		Node n7 = new Node(7, n8);
		Node n6 = new Node(6, n7);
		Node n5 = new Node(5, n6);*/
		Node n4 = new Node(4, null);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		return n1;
	}


}
