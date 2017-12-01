package Practise.practiseid;


/*How do you convert a binary search tree into a sorted double-linked list without creating any
new nodes? It is only allowed that you can reconnect links between existing nodes.*/
public class ConvertBSTtoDoubleLinkedList {
	


	class Node {
		int data;
		Node left;
		Node right;

		public Node(int value, Node left, Node right) {
			data = value;
			this.left = left;

			this.right = right;
		}
	}

	public static void main(String args[]) {
		ConvertBSTtoDoubleLinkedList rll = new ConvertBSTtoDoubleLinkedList();
		Node n1 = rll.createTree1();
	//	rll.printList(n1);
		Node n=rll.convertToDoublyLinkedList(n1);
		rll.printLinkedList(n);
	}

	
	private void printLinkedList(Node n) {
		while(n!=null){
			System.out.println(n.data);
			n=n.right;
		}
	}


	private Node convertToDoublyLinkedList(Node n1) {
		
		/*if(n1==null){
			return;
		}*/
		Node head=null;
		Node parent=null;
	while(n1!=null){	
		while(n1.left!=null){
			Node root=n1.left;
			n1.left=root.right;
			root.right=n1;
			n1=root;
			if(parent!=null){
				parent.right=n1;
			}
		}
		if(head==null){
		head=n1;
		}
		parent=n1;
		
		n1=n1.right;
	}
	Node n2 = head;
		if (n2 != null) {
			Node n3 = n2.right;
			while (n3 != null) {
				n3.left = n2;
				n2 = n3;
				n3 = n3.right;
			}
		}
	return head;
	}


	private void printList(Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

	private Node createTree1() {
		Node n7 = new Node(11, null, null);
		Node n6 = new Node(9, null, null);
		Node n5 = new Node(7, null, null);
		Node n4 = new Node(5, null, null);
		Node n3 = new Node(10, n6, n7);
		Node n2 = new Node(6, n4, n5);
		Node n1 = new Node(8, n2, n3);
		return n1;
	}

}
