package whatnot;

import java.util.ArrayList;


public class NextNodeInorderTraversal {

	class Node{
		Node left;
		Node right;
		Node parent;
		char data;
		Node(Node lft, Node rt, Node par,char value ){
			left=lft;
			right=rt;
			parent=par;
			data=value;
			
		}
	}
		public static void main(String args[]){
			NextNodeInorderTraversal nnit=new NextNodeInorderTraversal();
			Node n=nnit.createTree();
			Node previousNode=n.left.right.right;
		//	nnit.inorderTraversal(n);
			Node nextNode = nnit.findNextNode(previousNode);
			System.out.print(nextNode.data);
			
		}
		ArrayList<Node> nodeList=new ArrayList<Node>();
		private Object Node;
	

	private void inorderTraversal(Node n) {
		
		if(n!=null){
		inorderTraversal(n.left);
		System.out.println(n.data);
		nodeList.add(n);
		inorderTraversal(n.right);
		}
		}



	public Node createTree() {
		Node n1=null;
		Node n2=null;
		Node n3=null;
		Node n4=null;
		Node n5=null;
		Node n6=null;
		Node n7=null;
		Node n8=null;
		Node n9=null;
		
		 n9=new Node(null, null,n3, 'g');
		 n8=new Node(null, null, n3,'f');
		 n7=new Node(null, null,n5, 'l');
		 n6=new Node(null, null,n5, 'h');
		 n5=new Node(n6, n7,n2, 'e');
		 n4=new Node(null, null,n2, 'd');
		 n3=new Node(n8, n9, n1, 'c');
		 n2=new Node(n4, n5,n1,'b');
		 n1=new Node(n2, n3,null, 'a');
		return n1;
	}

	public Node findNextNode(Node previousNode) {
		Node next=null;
		Node pright=null;
		Node prev=null;
		Node current=null;
		if(previousNode==null){
			return null;
		}
		if(previousNode.right!=null){
		pright=previousNode.right;
		
		while(pright.left!=null){
			pright=pright.left;
		}
		next=pright;
		}
		else{
			
			if(previousNode.parent!=null){
				 prev=previousNode.parent;
				 current=previousNode;
				while(prev.parent!=null && current==prev.right){
					current=prev;
					prev=prev.parent;
					
				}
			}
			next=prev;
		}
		
		
		return next;
		
	}
	
	
}
