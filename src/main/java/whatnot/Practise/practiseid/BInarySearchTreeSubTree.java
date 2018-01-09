package whatnot.Practise.practiseid;



public class BInarySearchTreeSubTree {
	

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String args[]) {
		BInarySearchTreeSubTree bst = new BInarySearchTreeSubTree();
		Node n = bst.createBinaryTree();
		bst.isSubTree(n);

		
	//	System.out.print(flag);
	}

	private boolean isSubTree(Node n) {
		int leftSize=0;
		int rightSize=0;
		if(n!=null){
		}
	boolean left=isSubTree(n.left);
	boolean right=isSubTree(n.right);
	if(left && right)	{
		leftSize=leftSize+1;
		rightSize=rightSize+1;
		
		}
		boolean overall=false;	
		return overall;	
		
	}

	private boolean checkIfBinarySearch(Node n, int min, int max) {

		if (n == null) {
			return true;
		}

		if (n != null) {
			return checkIfBinarySearch(n.left, min, n.data)
					&& (n.data > min && n.data <= max)
					&& checkIfBinarySearch(n.right, n.data, max);

		}

		return false;
	}

	private Node createBinaryTree() {
		Node n9 = new Node(9);
		Node n6 = new Node(6);
		Node n5 = new Node(5);
		Node n8 = new Node(8);
		Node n10 = new Node(10);
		Node n12 = new Node(12);
		n12.left = n6;
		n9.left = n8;
		n12.right = n9;
		n9.right = n10;
		
		n6.left = n5;
		

		return n12;
	}


}
