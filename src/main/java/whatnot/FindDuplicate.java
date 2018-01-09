package whatnot;

public class FindDuplicate {

	public static void main(String args[]){
		int arr[]={0,2,1,10,2};
		int sum=0;
		int sum1=0;
		int diff=0;
		for(int i=0;i<arr.length;i++){
			sum=sum + arr[i];
			sum1=sum1 + i;
		}
		if(sum>0){
		 diff=sum1-sum;
		System.out.print("the duplicate no is : "+diff);
		}
	}
}



/*int duplicate(int numbers[]) {
int length = numbers.length;
int sum1 = 0;
for(int i = 0; i < length; ++i) {
if(numbers[i] < 0 || numbers[i] > length - 2)
throw new IllegalArgumentException("Invalid numbers.");
sum1 += numbers[i];*/
