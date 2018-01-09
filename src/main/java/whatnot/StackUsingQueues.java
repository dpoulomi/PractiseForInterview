package whatnot;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

private Queue<Integer> q1=new LinkedList<Integer>();

private Queue<Integer> q2=new LinkedList<Integer>();



    public static void main(String[] args) throws Exception {
        StackUsingQueues stackUsingQueues=new StackUsingQueues();
        stackUsingQueues.stackOperations();
    }

    private void stackOperations() throws Exception {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        System.out.println(pop());
        System.out.println(top());
        System.out.println(pop());
        System.out.println(top());

    }

    private int top() {

        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.poll());

        }
        int top=q1.peek();
        q2.add(top);
       Queue q=q1;
       q1=q2;
       q2=q;

        return top;
    }

    public void push(int element){

        q1.add(element);

    }

    public int pop() throws Exception {
        if(q1.isEmpty()){
            throw  new Exception("No element present.");
        }

        while(q1.size()!=1){
q2.add(q1.poll());

        }
        int popped=q1.poll();
        while(!q2.isEmpty()){
            q1.add(q2.poll());

        }

        return popped;
    }



}
