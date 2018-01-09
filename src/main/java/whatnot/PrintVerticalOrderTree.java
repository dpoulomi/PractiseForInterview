package whatnot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintVerticalOrderTree {

    private int LEFT_MOST_VLEVEL = 0;
    private int RIGHT_MOST_VLEVEL = 0;

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
        PrintVerticalOrderTree printVerticalOrderTree = new PrintVerticalOrderTree();
        Node n1 = printVerticalOrderTree.createTree1();
        printVerticalOrderTree.printVerticalBinaryTree(n1);
    }


    private void printVerticalBinaryTree(Node root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int hd = 0;
        getMaxMin(root, hd, map);

        for(int i = LEFT_MOST_VLEVEL; i <= RIGHT_MOST_VLEVEL; ++i) {
            if(map.containsKey(i)) {
             String list = map.get(i).stream()
                        .map(in -> in.toString())
                        .collect(Collectors.joining("| "));
                System.out.println(list);
              /* List values=map.get(i);
               for(Object val:values) {
                   System.out.print(val);
               }
                System.out.println();*/
            }
        }
    }

    private void getMaxMin(Node root, int hd, Map<Integer, List<Integer>> map) {

        if(hd < LEFT_MOST_VLEVEL) {
            LEFT_MOST_VLEVEL = hd;
        }
        if(hd > RIGHT_MOST_VLEVEL) {
            RIGHT_MOST_VLEVEL = hd;
        }
        if(root==null){
            return;
        }
        List<Integer> list= map.get(hd);
        if(list==null){
            list=new ArrayList();
            list.add(root.data);

        }else{
            list.add(root.data);
        }
        map.put(hd,list);
        getMaxMin(root.left,hd-1,map);
        getMaxMin(root.right,hd+1,map);
    }


    private void printList(Node n) {
        if (n != null) {
            printList(n.left);
            System.out.print(n.data + "->");
            printList(n.right);
        }
    }

    private Node createTree1() {
        Node n11 = new Node(1, null, null);
        Node n10 = new Node(2, null, null);

        Node n9 = new Node(2, null, null);
        Node n8 = new Node(1, null, null);

        Node n7 = new Node(5, n10, n11);
        Node n6 = new Node(7, null, null);
        Node n5 = new Node(7, null, null);
        Node n4 = new Node(5, n8, n9);
        Node n3 = new Node(6, n6, n7);
        Node n2 = new Node(6, n4, n5);
        Node n1 = new Node(8, n2, n3);
        return n1;
    }


}
