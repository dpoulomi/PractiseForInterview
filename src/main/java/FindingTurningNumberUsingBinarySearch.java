
public class FindingTurningNumberUsingBinarySearch {

	public static void main(String args[]){
		int arr[]={1, 2, 3, 4, 5, 6,10, 9, 8, 7,};
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		FindingTurningNumberUsingBinarySearch ftn= new FindingTurningNumberUsingBinarySearch();
		int position=ftn.getTurningNumber(arr,start, end, mid);
		System.out.print(position);
		
	}

	private int getTurningNumber(int[] arr,int start, int end, int mid) {
		if(arr.length<=2){
			return -1;
		}
		
		int midElement=0;
		while(end>start){
			midElement=arr[mid];
			if(midElement>arr[mid-1]&& midElement<arr[mid+1]){
				start=mid;
				mid=(start+end)/2;
				getTurningNumber(arr, start, end, mid);
			}
			else if(midElement<arr[mid-1]&& midElement>arr[mid+1]){
				end=mid;
				mid=(start+end)/2;
				getTurningNumber(arr, start, end, mid);
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}
