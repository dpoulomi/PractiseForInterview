package whatnot;

//A turning number is the maximum number in a unimodal array that increases and then
//decreases. Please write a function (or a method) that finds the index of the turning number in a unimodal array.
//For example, the turning number in the array {1, 2, 3, 4, 5, 10, 9, 8, 7, 6} is 10, so its index 5 is the expected
//output.
public class FindTurningNumber {

	public static void main(String args[]){
		int arr[]={1, 2, 3, 4, 5, 6,10, 9, 8, 7,};
		FindTurningNumber ftn= new FindTurningNumber();
		int position=ftn.getTurningNumber(arr);
		System.out.print(position);
		
	}

	int getTurningNumber(int[] arr) {
		if(arr.length==0 || arr.length==1){
			return 0;
		}
				int lastNumber=arr.length-1;
        for(int i=0;i<=arr.length;i++){
        	if(arr[i]>lastNumber){
        		return i;
        	}
        }
        return 0;
	}
}
