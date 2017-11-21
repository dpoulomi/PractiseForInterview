



public class PrintLinkedListTailToHead {


	class Node {
		int value;
		Node next;

		public Node(int data, Node next) {
			 value = data;
			this.next = next;
		}

	}

	private void printList(Node n) {
		if (n != null) {
		
			System.out.println(n.value);
			printList(n.next);

		}
	//	System.out.println("Original list");
	}
	
	
	public static void main(String args[]) {
		PrintLinkedListTailToHead rll = new PrintLinkedListTailToHead();
		Node n = rll.createlist();

		rll.printList(n);
		
	
	rll.printListTailToHead(n);
	}
	
	private void printListTailToHead(Node n) {
		if (n != null) {
			printListTailToHead(n.next);
			System.out.println(n.value);
			

		}
	//	System.out.println("Tail to Head list");
		
	}


	private Node createlist() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		

		return n1;
	}
	
}
