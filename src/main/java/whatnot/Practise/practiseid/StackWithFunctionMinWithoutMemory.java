package whatnot.Practise.practiseid;

import java.util.Stack;

public class StackWithFunctionMinWithoutMemory {

private static int min_element=0;
private static Stack<Integer> s=new Stack<>();

	public static void main(String args[]) throws Exception {
		StackWithFunctionMinWithoutMemory pd = new StackWithFunctionMinWithoutMemory();
		pd.push(9);
		pd.push(8);
		pd.push(12);
		pd.push(11);
		pd.push(7);
		pd.push(2);
		pd.push(2);
		pd.pop();
		pd.pop();
		int element = pd.getMin();
		System.out.println(element);

	}
	
	public void push(int element){
		if(s.isEmpty()){
			s.push(element);
			min_element=element;
		}else if(element>=s.peek()){
			s.push(element);
		}else if(element<s.peek()){
			s.push(2*element-min_element);
			min_element=element;
		}
		
	}
	
	public void pop(){
		if(s.peek()<min_element){
			min_element=2*min_element+s.peek();
		}
		s.pop();
	}
	
	public int peek(){
		int top=s.peek();
		if(min_element<top){
			top= min_element;
		}
		return top;
	}

	private int getMin() throws Exception {
		return min_element;
	}

	

}
