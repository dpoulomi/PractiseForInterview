package Practise.practiseid;

import Practise.practiseid.BInarySearchTree.Node;

public class BST {
class Node{
	 
	 int data;
	 Node left, right;
	 
	 Node(int item){
		data=item;
		left=right=null;
		 
	 }
	 
 }

Node root;

BST(){
	root=null; 
}

public void insert(int data){
	 root=insertRecursion(root,data);
	
}

public Node insertRecursion(Node root,int key){
	
	if(root==null){
		root= new Node(key );
		return root;
	}
    50
    /     \
   30      70
  /  \    /  \
20   40  60   80 */
	 if (key < root.data)
         root.left = insertRecursion(root.left, key);
     else if (key > root.data)
         root.right = insertRecursion(root.right, key);
		return root;
		
	}
}

