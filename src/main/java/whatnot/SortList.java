package whatnot;

public class SortList {
	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		SortList rll = new SortList();
		Node n = rll.createlist();
		 rll.printList(n);
		Node n1=rll.sortList(n);
		 rll.printList(n1);
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.data);

			printList(n.next);
		}
	}

	private Node createlist() {
		Node n4 = new Node(15, null);
		Node n3 = new Node(20, n4);
		Node n2 = new Node(30, n3);
		Node n1 = new Node(10, n2);
		return n1;
	}

	public Node sortList(Node n) {
		if(n==null ||  n.next==null){
			
			return n;
		}
		Node midptr=getMidPointer(n);
		
		Node nextToMid=midptr.next;
		midptr.next=null;
		Node left=sortList(n);
		Node right=sortList(nextToMid);
		Node sortedList =sortHalves(left,right);
		
	/*	Node nxt = null;
		Node current = null;
		Node previous = null;
		current=n;

		while (n != null && current.data > current.next.data) {
			nxt=current.next;
			current.next=previous;
			previous =current;
			current=nxt;

		}
		n=previous;
		return n;*/
		return sortedList;
	}

	private Node sortHalves(Node n1,Node n2) {
		Node result=null;
    if(n1==null){
    	return n2;
          }
    if(n2==null){
		return  n1;
    }
    if(n1.data<n2.data){
    	result=n1;
    	result.next=sortHalves(n1.next,n2);
    	
    }else{
    	result=n2;
    	result.next=sortHalves(n1, n2.next);
    }
    return result;
	}

	private Node getMidPointer(Node n) {
		Node fastptr=n.next;
		Node slwptr=n;
		while(fastptr!=null){
		fastptr=fastptr.next;
		if(fastptr!=null){
			fastptr=fastptr.next;
			slwptr=slwptr.next;
		}
		}
		return slwptr;
	}
}
