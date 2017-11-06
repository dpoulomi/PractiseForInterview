import java.util.LinkedList;

public class DeleteNodeFromLinkedList1 {
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
	
	public void deleteNode(int position){
		if(head==null){
			
			return;
		}
		Node temp=head;
		if(position==0){
			head=temp.next;
		}
		for(int i=0;i<=position-1;i++){
			
			temp=temp.next;
		}
		if(temp==null || temp.next==null){
			return;
		}
		Node nxt=temp.next.next;
		temp.next=nxt;
	}
	public static void main(String args[]) {
		DeleteNodeFromLinkedList1 dl=new DeleteNodeFromLinkedList1();
		
		LinkedList<Integer> ll = new LinkedList<>();
		dl.push(1);
		dl.push(2);
		dl.push(3);
		dl.push(4);
		dl.push(5);
		dl.push(6);
		dl.push(7);
		dl.push(8);
		dl.push(9);
		dl.push(10);
		dl.printList();
		dl.deleteNode(2);
		dl.printList();
	}
}
