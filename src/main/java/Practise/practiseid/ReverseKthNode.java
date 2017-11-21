package Practise.practiseid;

/*How do you design an algorithm to reverse every k nodes in a list? A list is divided into several
groups, and each group has k nodes except the last group, where the number of nodes may be less than k. Please
reverse the nodes in each group and connect all groups together.*/
public class ReverseKthNode {


	class Node {
		int data;
		Node next;

		public Node(int value, Node node) {
			data = value;
			next = node;
		}
	}

	public static void main(String args[]) {
		ReverseKthNode rll = new ReverseKthNode();
		Node n = rll.createlist();
		int k=3;
		rll.printList(n);
		System.out.println();
		Node n1;
		try {
			n1 = rll.reverseLinkedList(n,k);
			rll.printList(n1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Node reverseLinkedList(Node head, int k) throws Exception {
		Node pReversedHead = null;
		Node pNode1 = head;
		Node pPrev = null;
		while (pNode1 != null) {
			Node pNode2 = pNode1;
			Node pNext = null;
			for (int i = 1; pNode2.next != null && i < k; ++i) {
				pNode2 = pNode2.next;
				pNext = pNode2.next;
			}
				reverseGroup(pNode1, pNode2);
				if (pReversedHead == null)
					pReversedHead = pNode2;
				if (pPrev != null) {
					pPrev.next = pNode2;
				}
				pPrev = pNode1;
			
			pNode1 = pNext;
		}
		return pReversedHead;
	}

	private void reverseGroup(Node pNode1, Node pNode2) {
		// TODO Auto-generated method stub
		Node pNode = pNode1;
		Node pPrev = null;
		while(pNode != pNode2) {
		Node pNext = pNode.next;
		pNode.next = pPrev;
		pPrev = pNode;
		pNode = pNext;
	}
		pNode.next = pPrev;
	}

	private void printList(Node n) {
		if (n != null) {
			System.out.print(n.data + "->");
			printList(n.next);
		}
	}

	private Node createlist() {
		/*Node n11 = new Node(11, null);
		Node n10 = new Node(10, n11);
		Node n9 = new Node(9, n10);
		Node n8 = new Node(8, n9);
		Node n7 = new Node(7, n8);
		Node n6 = new Node(6, n7);
		Node n5 = new Node(5, n6);*/
		Node n4 = new Node(4, null);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		return n1;
	}



}
