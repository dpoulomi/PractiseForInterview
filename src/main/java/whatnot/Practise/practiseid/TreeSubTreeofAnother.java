package whatnot.Practise.practiseid;

public class TreeSubTreeofAnother {

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
		TreeSubTreeofAnother rll = new TreeSubTreeofAnother();
		Node n1 = rll.createTree1();
		Node n2 = rll.createTree2();
		rll.printList(n1);
		System.out.println();
		rll.printList(n2);
		System.out.println();
		try {
			boolean flag = rll.HasSubtree(n1, n2);
			System.out.println(flag);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*private boolean checkWhtherSubTree(Node n1, Node n2) {
		boolean left=false;
		boolean right=false;
		boolean overall=false;
		if (n1 == null && n2 != null) {
			return false;
		}
		if (n1 != null && n2 == null) {
			return true;
		}
		if (n1 != null && n2 != null && n1.data != n2.data) {
			checkWhtherSubTree(n1.left, n2);
			checkWhtherSubTree(n1.right, n2);
		}
		else if(n1 != null && n2 != null && n1.data == n2.data)	{
			 left=checkForNodeMatch(n1.left,n2.left);
			 right=checkForNodeMatch(n1.left,n2.left);
		}
		
		if(left && right){
			return true;
		}


		return false;
	}*/
	
	
	boolean HasSubtree(Node pRoot1,Node pRoot2) {
		boolean result = false;
		if(pRoot1 != null && pRoot2 != null) {
		if(pRoot1.data== pRoot2.data)
		result = DoesTree1HaveTree2(pRoot1, pRoot2);
		if(!result)
		result = HasSubtree(pRoot1.left, pRoot2);
		if(!result)
		result = HasSubtree(pRoot1.right, pRoot2);
		}
		return result;
		}

	private boolean DoesTree1HaveTree2(Node pRoot1, Node pRoot2) {
		if (pRoot2 == null)
			return true;
		if (pRoot1 == null)
			return false;
		if (pRoot1.data != pRoot2.data)
			return false;

		return DoesTree1HaveTree2(pRoot1.left, pRoot2.left)
				&& DoesTree1HaveTree2(pRoot1.right, pRoot2.right);
		
		}
		/*if (pRoot1.data != pRoot2.data)
			return false;

		return DoesTree1HaveTree2(pRoot1.left, pRoot2.left)
				&& DoesTree1HaveTree2(pRoot1.right, pRoot2.right);*/
	
	
	private void printList(Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

	private Node createTree1() {
		Node n9 = new Node(9, null, null);
		Node n8 = new Node(8, null, null);
		Node n7 = new Node(7, n8, n9);
		Node n6 = new Node(6, null, null);
		Node n5 = new Node(5, null, null);
		Node n4 = new Node(4, null, null);
		Node n3 = new Node(3, n6, n7);
		Node n2 = new Node(2, n4, n5);
		Node n1 = new Node(1, n2, n3);
		return n1;
	}

	private Node createTree2() {
		Node n5 = new Node(9, null, null);
		Node n4 = new Node(8, null, null);
		Node n2 = new Node(7, n4, n5);
		return n2;
	}

}
