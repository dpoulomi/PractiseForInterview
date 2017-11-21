package Practise.practiseid;


public class MergeSortRepeat {

	public static void main(String args[]){
		int arr[]={6,7,12,4,11,51,13,41};
		MergeSortRepeat qs1=new MergeSortRepeat();
		int start=0;
		int end=arr.length-1;
		qs1.mergeSort(arr,start, end);
		qs1.printArray(arr);
	}

	private void printArray(int[] arr) {
		
	}

	private void mergeSort(int[] arr, int start, int end) {
		int mid=(start+end)/2;
		if(end>start){
		mergeSort(arr, start, mid-1);
		mergeSort(arr, mid, end);
		mergeArray(arr,start,end);
		}
	}

	
	private void mergeArray(int[] arr, int start, int end) {
	}
}
