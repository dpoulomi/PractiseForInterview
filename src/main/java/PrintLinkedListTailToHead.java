import CloneLinkedList.Node;


public class PrintLinkedListTailToHead {


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
		CloneLinkedList rll = new CloneLinkedList();
		Node n = rll.createlist();

		//rll.printList(n);
		// list.printList(head);
	Node n1= rll.cloneLinkedList(n);
	//rll.printList(n1);
	}
	
}
