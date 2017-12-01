

public class CloneLinkedListRepeat {
	



	class Node {
		int value;
		Node next;
		Node arbitPointer;

		public Node(int data, Node next) {
			 value = data;
			this.next = next;
		}

	}

	public static void main(String args[]) {
		CloneLinkedListRepeat rll = new CloneLinkedListRepeat();
		Node n = rll.createlist();
		rll.printList(n);
		Node n1= rll.cloneLinkedList(n);
		rll.printList(n);
		rll.printList(n1);
	}

	Node head=null;
	

	private Node cloneLinkedList(Node n) {
		Node original=n;
		Node clone=null;
		Node temp=null;
		while(original!=null){
		temp=	original.next;
		original.next=new Node(original.value, temp);
		original=temp;
		}
		original=n;
		while(original!=null){
			original.next.arbitPointer=original.arbitPointer.next;
			original=original.next.next;
			
		}
		original=n;
		clone=original.next;
		temp=clone;
		while(original!=null && clone!=null){
			original.next=original.next.next;
					
			clone.next=original.next;
			original=original.next;
			clone=clone.next;
			
			
		}
		
		return temp;
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.value);
			printList(n.next);

		}

	}

	private Node createlist() {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		n5.arbitPointer = n2;
		n4.arbitPointer = n3;
		n3.arbitPointer = n5;
		n2.arbitPointer = n1;
		n1.arbitPointer = n3;

		return n1;
	}


	


}
