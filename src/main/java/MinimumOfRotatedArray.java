
public class MinimumOfRotatedArray {

	public static void main(String args[]){
		int arr[]={21,20,19,11,10,2};
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		MinimumOfRotatedArray minimumOfRotatedArray=new MinimumOfRotatedArray();
		int minElement=minimumOfRotatedArray.findMinimumElement(arr, start,  end, mid);
		System.out.print(minElement);
		
	}

	private int  findMinimumElement(int[] arr, int start, int end , int mid) {
		int pivot=0;
		while(end>start){
		 pivot=arr[mid];
	
		if(pivot>arr[0] && pivot>arr[end]){
			start=mid+1;
			mid=(start+end)/2;
			findMinimumElement(arr, start, end, mid);
			
			
		}else{
			end=mid-1;
			mid=(start+end)/2;
			findMinimumElement(arr, start, end, mid);
			
		}
		}
		return pivot;
	}
	
	
}
