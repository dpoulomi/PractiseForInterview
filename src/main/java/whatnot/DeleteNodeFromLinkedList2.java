package whatnot;

public class DeleteNodeFromLinkedList2 {
	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.data);

			printList(n.next);
		}
	}
	
	public static void main(String args[]) {
		DeleteNodeFromLinkedList2 rll = new DeleteNodeFromLinkedList2();
		Node n = rll.createlist();
		// rll.printList(n);
		Node n1=null;
		try {
			n1 = rll.deleteNodeFromList(n, n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rll.printList(n1);
	}

	private Node deleteNodeFromList(Node n, Node next) throws Exception {
		if(next==n){
			return n.next;
		}
		Node n1=n;
		Node temp=null;
		Node previous=null;
		
		while(n1!=null  && next!=null && n1 != next ){
			previous=n1;
			n1=n1.next;
		}
		if(n1!=null){
		temp=n1.next;
		previous.next=temp;
		}else{
			throw new Exception("Node could not be found.");
		}
		
		return n;
	}

	private Node createlist() {
		Node n4 = new Node(15, null);
		Node n3 = new Node(20, n4);
		Node n2 = new Node(30, n3);
		Node n1 = new Node(10, n2);
		return n1;
	}
}
