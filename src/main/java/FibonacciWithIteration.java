
public class FibonacciWithIteration {

	public static void main(String args[]){
		FibonacciWithIteration fb= new FibonacciWithIteration();
		int n=5;
	int nthTerm=fb.getNthValue(n);
	System.out.println(nthTerm);
	}
	
	private int getNthValue(int n) {
	int nthTerm=0;	
	int sum=0;
	int sum1=1;
		for(int i=2;i<=n;i++){
			nthTerm=sum+sum1;
			sum=sum1;
			sum1=nthTerm;
		}
		return nthTerm;
	}
	
}
