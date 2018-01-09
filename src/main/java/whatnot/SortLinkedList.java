package whatnot;

public class SortLinkedList {

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
		SortLinkedList rll = new SortLinkedList();
		Node n = rll.createlist();

		rll.printList(n);

		Node n1 = rll.sort(n);
		rll.printList(n1);
	}

	private Node sort(Node n) {
		Node sortedlinkedlist = null;
		/*
		 * if (n !=null && n.next != null) { if (n.value > n.next.value) { Node
		 * temp = n.next;//3 Node nextPointer=temp.next;//5 temp.next = n;//4
		 * n.next=nextPointer; n = temp;//3-->5 }
		 * 
		 * sort(n.next); }
		 */
		
		Node temp = null;
		Node linkedList = n;
		Node newLinkedList = linkedList;
	//	newLinkedList = n;
		temp = n;
		Node previous = null;
		Node iteratioList = n;
		while (iteratioList != null) {
			sortedlinkedlist = iteratioList;
			temp = iteratioList;
			while (sortedlinkedlist != null && sortedlinkedlist.next != null) {
				if (temp.value > sortedlinkedlist.next.value) {
					previous = sortedlinkedlist;
					temp = sortedlinkedlist.next;
				}
				sortedlinkedlist = sortedlinkedlist.next;
			}
			linkedList = iteratioList;
			if (temp != iteratioList) {
				
				Node present = linkedList;
				Node nextPointer = temp.next;
				linkedList = temp;
				linkedList.next = present;
				Node storeNextNode=iteratioList.next;
				while (linkedList != null) {
					if (linkedList == previous) {

						linkedList.next = nextPointer;
						// previous.next=nextPointer;
					}
					linkedList = linkedList.next;
				}

				// linkedList.next = temp;
				// temp.next = nextPointer;

			}
			//Node storeNextNode=iteratioList.next;
			//linkedList.next=newLinkedList;
		//	newLinkedList=linkedList;
		//	iteratioList =storeNextNode ;
			iteratioList=iteratioList.next;
			
			
		}
		return newLinkedList;
	}

	private Node createlist() {
		Node n3 = new Node(2, null);

		Node n5 = new Node(5, n3);
		Node n2 = new Node(3, n5);
		Node n4 = new Node(4, n2);
		Node n1 = new Node(1, n4);

		return n1;
	}

}
