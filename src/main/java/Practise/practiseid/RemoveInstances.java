package Practise.practiseid;


/*Given an array and a value, how do you implement a function to remove all instances of that
value in place and return the new length of the array? It is not required that you keep the order of the remaining
numbers. It doesn't matter what you leave beyond the new length.
For example, if the input array is {4, 3, 2, 1, 2, 3, 6}, the resulting array after removing value 2 contains the
numbers {4, 3, 1, 3, 6}, and the new length of the remaining array is 5.*/
public class RemoveInstances {

	public static void main(String args[]){
		RemoveInstances re=new RemoveInstances();
		int value=2;
		int arr[]={4, 3, 2, 1, 2, 3, 6};
	int index=	re.removeInstances(arr,value);
	System.out.println(index);
	
		
		
	}

	private int removeInstances(int[] arr, int value) {
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=value){
				arr[j++]=arr[i];
			}
			
		}
		return j;
	}
	
}
