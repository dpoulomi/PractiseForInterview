package whatnot;

public class BinaryTreeSelf {
class Node{
	
	int data;
	Node left;
	Node right;
	
	Node(int element , Node lft, Node rt){
		data=element;
		left=lft;
		right=rt;
		
	}
}

public static void main(String args[]){
	BinaryTreeSelf bs=new BinaryTreeSelf();
Node n=	bs.createTree();
bs.inorder(n);
int count=bs.getHeight(n);
System.out.println(count);
}

public Node createTree(){
	Node n8=new  Node(8, null, null);
	Node n6=new  Node(6, null, null);
	Node n7=new  Node(7, null, n8);
	Node n4=new  Node(4, null, null);
	Node n5=new  Node(5, null, null);
	Node n2=new  Node(2, n4, n5);
	Node n3=new  Node(3, null, n7);
	Node n1=new  Node(1, null, n3);
	return n1;
}

public void inorder(Node n){
	if(n!=null){
		inorder(n.left);
		System.out.println(n.data);
		inorder(n.right);
	}
}

int count=0;
public int getHeight(Node n){
	
	if(n==null){
		return -1;
	}
	int left=getHeight(n.left);
	int right=getHeight(n.right);
	if(left>right){
		return left +1;
	}
		else{
			return right +1;
		}
	}
		
}

