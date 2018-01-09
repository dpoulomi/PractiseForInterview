package whatnot;

public class SumofNelements {
public static void main(String args[]){
	SumofNelements s=new SumofNelements();
	int n=20;
	int sum=s.findSum(n);
	System.out.println(sum);
	
}
public int findSum(int n) {
	int sum=0;
for(int i=20;i>=0;i--){
	sum=sum+i;
}
return sum;
}
}
