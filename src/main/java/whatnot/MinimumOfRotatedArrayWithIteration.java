package whatnot;

public class MinimumOfRotatedArrayWithIteration {


	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8};
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		MinimumOfRotatedArrayWithIteration minimumOfRotatedArray=new MinimumOfRotatedArrayWithIteration();
		int minElement=minimumOfRotatedArray.findMinimumElement(arr, start,  end, mid);
		System.out.print(minElement);
		
	}

	private int  findMinimumElement(int[] arr, int start, int end , int mid) {
		
		int pivot=0;
		while(end>start){
			mid=(end+start)/2;
			pivot=arr[mid];
			if(pivot<arr[end]){
				end=mid-1;
				pivot=arr[(end+start)/2];
				
				
			}else if(pivot>arr[end]){

				start=mid+1;
				pivot=arr[(end+start)/2];
			
			}
			
		}
		
		return pivot;
}
	
	

}
