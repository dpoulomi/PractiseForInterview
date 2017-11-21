package Practise.practiseid;

public class SortLinkedList1 {

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
		SortLinkedList1 rll = new SortLinkedList1();
		Node n = rll.createlist();

		rll.printList(n);

		Node n1 = rll.sort(n);
		rll.printList(n1);
	}

	private Node sort(Node n) {
		if(n==null || n.next==null){
			
			return n;
		}
		Node pLastSorted = n;
		Node pToBeSorted = pLastSorted.next;
			while(pToBeSorted != null) {
					if(pToBeSorted.value < (n.value)) {
					pLastSorted.next = pToBeSorted.next;
					pToBeSorted.next = n;
					n = pToBeSorted;
					}
					else {
					Node pNode = n;
						while(pNode != pLastSorted && pNode.next.value < pToBeSorted.value) {
						pNode = pNode.next;
						}
							if(pNode != pLastSorted) {
								pLastSorted.next = pToBeSorted.next;
								pToBeSorted.next = pNode.next;
								pNode.next = pToBeSorted;
							}
					else
								pLastSorted = pLastSorted.next;
					}
			pToBeSorted = pLastSorted.next;
			}
		return n;
		
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
