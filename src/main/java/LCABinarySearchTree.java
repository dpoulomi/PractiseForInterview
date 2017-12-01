import com.home.ll.Node;


public class LCABinarySearchTree {

	public static void main(String args[]) {
		LCABinarySearchTree rll = new LCABinarySearchTree();
		Node n1 = rll.createTree1();
		rll.printList(n1);
		System.out.println();

		com.home.ll.Node n = rll.findLCA( n1,new Node(10, null, null), new Node(9, null, null));
		System.out.println(n.data);
	}

	
	private Node findLCA(Node head, Node node1, Node node2) {
		if (head == null || node1 == null || node2 == null) {
			return null;
		}
		if (head.data >= node1.data && head.data >= node2.data) {
			head=head.left;
			if((head.left.data==node1.data || head.left.data==node2.data) || 
					(head.right.data==node1.data || head.right.data==node2.data)){
				return findLCA(head, node1, node2);
			}else{
				return null;
			}
			
		}
		if (head.data <= node1.data && head.data <= node2.data) {
			head=head.right;
			if((head.left.data==node1.data || head.left.data==node2.data) || 
					(head.right.data==node1.data || head.right.data==node2.data)){
			return findLCA(head, node1, node2);
			}else{
				return null;
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