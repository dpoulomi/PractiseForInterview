package whatnot;

public class Singleton {

	private Singleton(){
		
		
	}
	
	private static Singleton instance=null;
	private static Object lock =new Object();
	private static Singleton  getInstance(){
		Object lock=null;
		if(instance!=null){
			synchronized(lock){
				if(instance!=null){
					instance=new Singleton();
				
				}
				
			}
			
		}
		
		return instance;
		
	}
}
