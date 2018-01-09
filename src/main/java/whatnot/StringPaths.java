package whatnot;

import java.util.Stack;

public class StringPaths {
    public static void main(String[] args) {
        char[][] arr;
        arr = new char[][]{
                {'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String str="bccde";
        int rows=arr.length-1;
        int cols=arr[0].length-1;
       // int i=0;
        int j=0;
        int k=0;
        Stack stack=new Stack();
        StringPaths stringPaths=new StringPaths();
        for(int i=0;i<rows;i++) {
            stringPaths.checkIfPathPresent(arr, stack, rows, cols, str, i, j, k);
        }
        System.out.println(stack);

    }

public void checkIfPathPresent(char[][] arr,Stack stack,int rows,int cols,String str,int i,int j,int k){
        if(k<=str.length()-1) {
            if (arr[i][j] == str.charAt(k)) {
                stack.push(arr[i][j]);
                k++;
            }else{}
            if (i <= rows || j <= cols) {
                if (i <= rows && j < cols) {
                    checkIfPathPresent(arr, stack, rows, cols, str, i, j+1, k);
                }
            }
        }
}

}
