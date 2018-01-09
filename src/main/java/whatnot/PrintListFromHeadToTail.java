package whatnot;

public class PrintListFromHeadToTail {
	
	class Node{
		int data;
		Node next;
		
		public Node(int value,Node node) {
			data=value;
			next=node;
		}
	}

	public static void main(String args[]){
		PrintListFromHeadToTail plfht=new PrintListFromHeadToTail();
		Node n=plfht.createlist();
	//	plfht.printList(n);
		plfht.printReverseList(n);
	}

	private void printReverseList(Node n) {
		if(n!=null){
			printReverseList(n.next);
			System.out.println(n.data);
		}
	}

	private void printList(Node n) {
		if(n!=null){
			System.out.println(n.data);
		
		printList(n.next);
		}
	}

	private  Node createlist() {
		Node n3=new Node(30, null);
		Node n2=new Node(20, n3);
		Node  n1=new Node(10, n2);
		return n1;
	}
}
