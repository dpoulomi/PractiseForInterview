package whatnot;

import java.util.Stack;

public class CombinationofaString {
    public static void main(String[] args) {

        String str = "abcd";
      Stack result=new Stack();
        CombinationofaString combinationofaString = new CombinationofaString();
        for(int i=1;i<=str.length();i++) {
            combinationofaString.getNumberOfCombinations(str, 0, i, result);
        }
    }


    public void getNumberOfCombinations(String str, int index, int number, Stack result){

if(number==0){
    System.out.println(result);
    return;
}
if(index==str.length()){
    return;
}
result.push(str.charAt(index));
getNumberOfCombinations(str,index+1,number-1,result);
result.pop();
getNumberOfCombinations(str,index+1,number,result);

    }
    }