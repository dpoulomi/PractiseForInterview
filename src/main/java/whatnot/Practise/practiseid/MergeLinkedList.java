package whatnot.Practise.practiseid;

//Please implement a function to merge two sorted lists into a single sorted list. For example, the
//merged list of two sorted lists, L1 and L2 in Figure 3-7, is L3.

public class MergeLinkedList {
	class Node {
		int value;
		Node next;

		public Node(int data, Node next) {
			value = data;
			this.next = next;
		}
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.println(n.value);
			printList(n.next);
		}
	}

	public static void main(String args[]) {
		MergeLinkedList rll = new MergeLinkedList();
		Node firstSortedList = rll.createlist();
		Node secondSortedList = rll.createList1();
		Node n1 = rll.merge(firstSortedList, secondSortedList);
		rll.printList(n1);
	}

	private Node createList1() {
		Node n7 = new Node(7, null);
		/*Node n5 = new Node(5, n7);
		Node n3 = new Node(3, n5);*/
		Node n1 = new Node(1, n7);

		return n1;
	}

	private Node merge(Node n1, Node n2) {
	Node firstList=n1;	Node temp=null;
	Node secondList=n2;
	while(firstList!=null && secondList!=null && secondList.next!=null){
	if(firstList.value>secondList.value && firstList.value<secondList.next.value){
		temp=firstList.next;
		firstList.next=secondList.next;
		secondList.next=firstList;
		firstList=temp;
		
	}
	
	secondList=secondList.next;
}
while(firstList!=null){
	if(secondList.next!=null){
		secondList=secondList.next;
	}
	secondList.next=firstList;
	firstList=firstList.next;
	}
		return n2;
	}

	private Node createlist() {
		
		Node n8 = new Node(8, null);
		Node n6 = new Node(6, n8);
		Node n4 = new Node(4, n6);
		Node n1 = new Node(2, n4);

		return n1;
	}

}
