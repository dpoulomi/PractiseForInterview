package Practise.practiseid;

public class FinfkthNode {

	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		FinfkthNode rll = new FinfkthNode();
		Node n = rll.createlist();
		int k = 18;
		rll.printList(n);
		System.out.println();
		Node n1;
		try {
			n1 = rll.findKthNode(n, k);
			System.out.println(n1.data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Node findKthNode(Node head, int k) throws Exception {

		Node slwptr = head;
		Node fastptr = head;
		if (slwptr.next == null && k > 1) {
			throw new Exception("Only one node present");
		} else if (slwptr.next == null && k == 0 ) {
			return slwptr;
		}
		else if(slwptr==null || k<0){
			throw new Exception("Request cannot be processed");
		}
		int nodeCounter = 0;
		while (fastptr!=null && k > 0) {
			fastptr = fastptr.next;
			k--;
			++nodeCounter;
		}
		if(fastptr==null && k>0){
			throw new Exception("The value of k is greater than number of nodes::" + nodeCounter);
		}

		while (fastptr != null) {
			slwptr = slwptr.next;
			fastptr = fastptr.next;

		}

		return slwptr;
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.print(n.data + "->");
			printList(n.next);
		}
	}

	private Node createlist() {
		Node n11 = new Node(11, null);
		Node n10 = new Node(10, n11);
		Node n9 = new Node(9, n10);
		Node n8 = new Node(8, n9);
		Node n7 = new Node(7, n8);
		Node n6 = new Node(6, n7);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		return n1;
	}

}
