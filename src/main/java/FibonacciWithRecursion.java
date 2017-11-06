
public class FibonacciWithRecursion {

	public static void main(String args[]){
		FibonacciWithRecursion fb= new FibonacciWithRecursion();
		int n=4;
	int nthTerm=fb.getNthValue(n);
	System.out.println(nthTerm);
	}
	private int getNthValue(int n) {
		
		if (n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(n>1){
	return	getNthValue(n-1)+getNthValue(n-2);
		}
		return 0;
	}
	
}
