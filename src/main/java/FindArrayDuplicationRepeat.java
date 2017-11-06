//An array contains n numbers ranging from 0 to n-2. There is exactly one number duplicated in
//the array. How do you find the duplicated number? For example, if an array with length 5 contains numbers {0, 2,
//1, 3, 2}, the duplicated number is 2.


public class FindArrayDuplicationRepeat {

	
	public static void main(String args[]){
		
		int arr[]={0,2,1,3,2};
		FindArrayDuplicationRepeat far=new FindArrayDuplicationRepeat();
		far.findDuplicate(arr);
		
	}

	private void findDuplicate(int[] arr) {
		
		
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0 || arr[i]>arr.length-2){
				throw new IllegalArgumentException("The numbers are invalid");
			}
			sum=sum+i;
			sum1=sum1+arr[i];
		}
		
		System.out.println(sum-sum1);
		
	}
}
