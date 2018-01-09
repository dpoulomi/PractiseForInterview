package whatnot.Practise.practiseid;

import java.util.Stack;
//Please design a queue with two stacks and implement methods to enqueue and dequeue
//items.

public class QueueWithTwoStacks {
private static Stack stack1=new Stack<>();
private static Stack stack2=new Stack<>();

	public static void main(String args[]){
		
		QueueWithTwoStacks qs=new QueueWithTwoStacks();
		qs.enQue(1);
		qs.enQue(2);
		qs.enQue(3);
		qs.print();
		
		try {
			qs.deQue();
			qs.deQue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		qs.print();
		qs.enQue(2);
		qs.enQue(1);
		qs.print();
		
	}

	private  void print() {
for(int i=0;i<=stack1.size()-1;i++){
	System.out.println(stack1.elementAt(i));
}		
	}

	private void deQue() throws Exception {
		if(stack1.isEmpty()){
			throw new  Exception("No elemnt in stack");
		}
		if(!stack2.isEmpty()){
	while(stack1!=null &&  stack1.size()!=1){
		
		stack2.push(stack1.pop());
		
	}
	stack1.pop();
		}
	while(!stack2.isEmpty()){
		
		stack1.push(stack2.pop());
	}
	}

	private void enQue(int i) {
stack1.push(i);		
	}
}
