package Practise.practiseid;

import java.util.ArrayList;


public class LCAusingPaths {



	public class Node {
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
		LCAusingPaths rll = new LCAusingPaths();
		Node n1 = rll.createTree1();
		rll.printList(n1);
		int n=findLCA(n1.left.left.left,n1.left.left.right,n1);
		System.out.println();
		System.out.println(n);
	}

	private static ArrayList<Integer> path1=new ArrayList<>();
	private static ArrayList<Integer> path2=new ArrayList<>();

	private static int findLCA(Node n1, Node n2, Node root) {
		if(!findLowestCommonAncestorPresent(n1,root,path1) || 
				!findLowestCommonAncestorPresent(n2, root, path2)){
			System.out.print(path1.size()> 0 ? "n1 is present" :"n1 is missing");
			System.out.print(path2.size()> 0 ? "n2 is present" :"n2 is missing");
		}
		int i=0;
		for( i=0;i<path1.size() && i<path2.size();i++){
			if(!path1.get(i).equals(path2.get(i))){
				break;				
			}
		}
		
		return path1.get(i-1);
	}





	private static boolean findLowestCommonAncestorPresent(Node n, Node root,
			ArrayList<Integer> path) {
		if(root==null){
			return false;
		}
		path.add(root.data);
		if(n.data==root.data){
			return true;
		}
		
		if(root.left!=null && findLowestCommonAncestorPresent(n, root.left, path)){
			return true;
		}
		if(root.right!=null && findLowestCommonAncestorPresent(n, root.right, path)){
			return true;
		}
		
		path.remove(path.size()-1);
		
		return false;
	}





	private void printList(Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

	private Node createTree1() {
		Node n21 = new Node(21, null, null);
		Node n20 = new Node(20, null, null);
		Node n18 = new Node(18, n20, n21);
		Node n13 = new Node(16, null, null);
		Node n14 = new Node(17, null, null);
		Node n12 = new Node(12, n13, n14);
		Node n11 = new Node(13, null, null);
		Node n10 = new Node(3, null, null);

		Node n9 = new Node(2, n18, n12);
		Node n8 = new Node(1, null, null);

		Node n7 = new Node(11, n10, n11);
		Node n6 = new Node(9, null, null);
		Node n5 = new Node(7, null, null);
		Node n4 = new Node(5, n8, n9);
		Node n3 = new Node(10, n6, n7);
		Node n2 = new Node(6, n4, n5);
		Node n1 = new Node(8, n2, n3);
		return n1;
	}


}
