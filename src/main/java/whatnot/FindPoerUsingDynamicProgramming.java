package whatnot;

public class FindPoerUsingDynamicProgramming {
	
	public static void main(String args[]){
		int x=2;int n=0;
		FindPoerUsingDynamicProgramming findPower=new FindPoerUsingDynamicProgramming();
		int product =findPower.pow(x,n);
		System.out.print(product);
		
	}
	int p=1;
	private int pow(int x, int n) {
		if(n==0){
			return p;
		}
		
		while(n!=1){
		if(n%2==0){
			 p=pow(x,n/2);
			return p*p;
			}
		else{
			 p=pow(x,(n-1));
			return p*x;
		}
		}
		return x;
	}
		

}
