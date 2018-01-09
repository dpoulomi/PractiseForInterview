package whatnot;


public class CareerCup1 {

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

	public static void main(String args[]) {
		CareerCup1 bs = new CareerCup1();
		Node n = bs.createTree();
		bs.inorder(n);
		//ArrayList l = bs.getList(n);
		int count=bs.getHeight(n);
		bs.printElements(n,count);
		 /*for (int i=0; i<l.size(); i++){
	            System.out.println(l.get(i));
	    }*/
	}

	public Node createTree() {
		Node n8=new  Node(8, null, null);
		Node n6=new  Node(6, null, null);
		Node n7=new  Node(7, null, n8);
		Node n4=new  Node(4, null, null);
		Node n5=new  Node(5, null, null);
		Node n2=new  Node(2, n4, n5);
		Node n3=new  Node(3, n6, n7);
		Node n1=new  Node(1, n2, n3);
		return n1;
	}

	public void inorder(Node n) {
		if (n != null) {
			inorder(n.left);
			// System.out.println(n.data);
			inorder(n.right);
		}
	}
	
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
	
	public void printElements(Node n,int count){
		for (int i = 0; i <= count; i++) {
			printEachElement(n, i);
			System.out.println();
		}
	}
	
	public void printEachElement(Node n, int count){
		if(count==0){
			System.out.print(n.data + "  ");
		}
		if(count>0){
			//System.out.println("");
			if(n.left!=null){
			printEachElement(n.left, count-1);
			}
			if(n.right!=null){
			printEachElement(n.right, count-1);
			}
		}
	}
}
