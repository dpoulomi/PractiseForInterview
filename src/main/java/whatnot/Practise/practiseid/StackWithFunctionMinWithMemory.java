package whatnot.Practise.practiseid;

import java.util.Stack;

public class StackWithFunctionMinWithMemory {
	public static void main(String args[]) throws Exception {
		StackWithFunctionMinWithMemory pd = new StackWithFunctionMinWithMemory();
	//	StackWithFunctionMin s = pd.createStack();
		/*pd.push(9);
		pd.push(8);
		pd.push(12);
		pd.push(11);
		pd.push(7);
		pd.push(2);
		pd.push(2);
		pd.pop();*/
		int element = pd.getMin();
		System.out.println(element);

	}
private static Stack<Integer> stackOfValues=new Stack<>();
private static Stack<Integer> stackOfMin=new Stack<>();
	
	public void push(int element){
		stackOfValues.push(element);
		if(stackOfMin.size()==0 || (element<=stackOfMin.peek().intValue())){
			stackOfMin.push(element);
		}
	}
	
	public void pop(){
		stackOfValues.pop();
		stackOfMin.pop();
		
	}

	private int getMin() throws Exception {
		if(stackOfMin.isEmpty()){
			throw new Exception("No element present in Stack"); 
		}
		return stackOfMin.peek();
	}

	
}
