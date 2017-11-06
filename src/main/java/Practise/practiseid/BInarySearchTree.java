package Practise.practiseid;

public class BInarySearchTree {
	
	class Node{
		int data;
		Node left ,right;
		
		public Node(int item){
			data=item;
			left=right=null;
			
		}
		
	}
	
	Node root;
	
	BInarySearchTree(){
		root=null;
		
	}
	
	 public void insert(int key) {
	       root = insertRec(root, key);
	    }

	private Node insertRec(Node root, int key) {  /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()  {
     //  inorderRec(root);
       preorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
    
 // A utility function to do inorder traversal of BST
    void preorderRec(Node root) {
        if (root != null) {
        	System.out.println(root.data);
        	preorderRec(root.left);
            
            preorderRec(root.right);
        }
    }
 
    public static void main(String[] args) {
        BInarySearchTree tree = new BInarySearchTree();
 
       
     
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // print inorder traversal of the BST
        tree.inorder();
    }
}


