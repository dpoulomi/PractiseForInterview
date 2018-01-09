package whatnot;


public class VerifyBinarySearchTreeInorder {
	class Node {

		int data;
		Node left;
		Node right;

		Node(int element, Node lft, Node rt) {
			data = element;
			left = lft;
			right = rt;

		}
	}

	public Node createTree() {
		Node n6 = new Node(112, null, null);
		Node n7 = new Node(116, null, null);
		Node n4 = new Node(5, null, null);
		Node n5 = new Node(81, null, null);
		Node n2 = new Node(6, n4, n5);
		Node n3 = new Node(114, n6, n7);
		Node n1 = new Node(100, n2, n3);
		return n1;
	}

	public static void main(String args[]) {
		VerifyBinarySearchTreeInorder bs = new VerifyBinarySearchTreeInorder();
		Node n = bs.createTree();
		// bs.preorder(n);
		// int count=bs.getHeight(n);
		// System.out.println(count);
		boolean flag = bs.verifyBinaryTree(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.print(flag);
	}
//1st approarch but extra space
	/*private boolean verifyBinaryTree(Node n) {
		inOrder(n);
		for(int i=arr.size()-1;i>0;i--){
			if(arr.get(i)<arr.get(i-1)){
				return false;
			}
			
		}
		return true;
	}
	ArrayList<Integer>  arr=new ArrayList<>();
	private ArrayList<Integer> inOrder(Node n) {
		if(n!=null){
			inOrder(n.left);
			arr.add(n.data);
			inOrder(n.right);
			
		}
		return arr;
	}*/

	private boolean verifyBinaryTree(Node n, Integer minvalue, Integer maxvalue) {
		if(n==null){
			return true;
		}
		if(n.data<minvalue || n.data>maxvalue)
		return false;
		
		return verifyBinaryTree(n.left,Integer.MIN_VALUE ,n.data-1 ) && verifyBinaryTree(n.right,n.data+1 ,Integer.MAX_VALUE );
	}
}
