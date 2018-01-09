package whatnot;

//There are three threads in a process. The first thread prints 1 1 1 …, the second one prints 2 2
	//2 …, and the third one prints 3 3 3 … endlessly. How do you schedule these three threads in order to print 1 2
	//3 1 2 3 …?
public class ThreadSchedulerRepeat implements Runnable {

	public static void main(String args[]){
		ThreadSchedulerRepeat t=new ThreadSchedulerRepeat();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++){
		//	System.out.print(Thread.currentThread().getId());
			System.out.println(i);
			
		}
	}
	
	
}
