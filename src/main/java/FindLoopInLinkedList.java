import java.util.LinkedList;


public class FindLoopInLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}
	public void push(int value) {
		Node new_Node = new Node(value);
		new_Node.next = head;
		head = new_Node;
	}
	public void printList() {
		 Node tnode = head;
		if (tnode!= null) {
			System.out.println(tnode.data);

			printList();
			tnode=tnode.next;
		}
	}
	public static void main(String args[]) {
		FindLoopInLinkedList dl=new FindLoopInLinkedList();
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.push(6);
		ll.push(7);
		ll.push(8);
		ll.push(4);
		dl.printList();
	
	
}
	
	public void detectLoop(){
		Node slowptr=head;
		Node fastptr=head.next;
		
		
	}
}