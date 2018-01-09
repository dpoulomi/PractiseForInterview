package whatnot;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedList {

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

	Node head=null;
	/*
	 * private void push(int val) { Node n=new Node(val); n.next=this.head;
	 * this.head=n;
	 * 
	 * }
	 */

	private Node cloneLinkedList(Node n) {
     	        Node oroginal =n, clone = null;
     	        clone=oroginal;
     	        printList(clone);
	   	        Map<Node, Node> map = new HashMap<Node, Node>();
	     	    while (oroginal != null){
	   	        	clone = new Node(oroginal.value, oroginal.next);
	      	        map.put(oroginal, clone);
	            oroginal = oroginal.next;
	        }
	     	        oroginal = n;
	   	        while (oroginal != null){
	        	clone = map.get(oroginal);
	        		        	//clone.next = map.get(oroginal.next);
	        	clone.arbitPointer = map.get(oroginal.arbitPointer);
	        	oroginal = oroginal.next;
	        }
	   	       clone=map.get(n); 
	       	        return clone;
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
