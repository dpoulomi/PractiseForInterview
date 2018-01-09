package whatnot;

public class ThreadScheduler implements Runnable{

	public ThreadScheduler() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]){
		ThreadScheduler t=new ThreadScheduler();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++){
			try {Thread.sleep(500);}
			catch(InterruptedException e){
				System.out.println(e);	
				
			}
System.out.println(i);
		}
	}
}
