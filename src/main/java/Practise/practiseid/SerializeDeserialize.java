package Practise.practiseid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SerializeDeserialize {



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

	public static void main(String args[]) throws FileNotFoundException {
		SerializeDeserialize rll = new SerializeDeserialize();
		Node n1 = rll.createTree1();
		File fp=new File("tree.txt","w");
		rll.serialize(n1,fp);
		Node n=null;
		rll.deserialize(n,fp);
		rll.printList(n1);
		System.out.println();

	}

	

	
	private void deserialize(Node root, File fp) throws FileNotFoundException {
		int val=0;
		BufferedReader br=new BufferedReader(new FileReader(fp));
		try {
			val=br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(val==0){
			root=null;
		}
		
		 root = new Node(val, null, null);
		 deserialize(root.left, fp);
		 deserialize(root.right, fp);
	}




	private void serialize(Node n1,File fp) {
		if(n1==null){
			System.out.printf("$", fp);
			return;
		}
		System.out.printf(n1.data + ",",fp);
		serialize(n1.left,fp);
		serialize(n1.right,fp);
	}




	private void printList(Node n) {
		if (n != null) {
			printList(n.left);
			System.out.print(n.data + "->");
			printList(n.right);
		}
	}

	private Node createTree1() {
		Node n12 = new Node(12, null, null);
		Node n11 = new Node(13, null, null);
		Node n10 = new Node(2, null, null);

		Node n9 = new Node(2, null, n12);
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
