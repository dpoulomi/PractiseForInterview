package whatnot;

public class QuickSort2Self {

	
	public static void main(String args[]){
		int arr[]={6,7,12,4,11,51,13,41};
		QuickSort2Self qs1=new QuickSort2Self();
		int start=0;
		int end=arr.length-1;
		qs1.quickSort(arr,start, end);
		qs1.printArray(arr);
		
		
	}

	private void quickSort(int[] arr, int start, int end) {
		if(end>start){
			int pi=partition(arr, start, end);
			quickSort(arr, start, pi-1);
			quickSort(arr, pi+1, end);
			
		}
		
		
	}
	
	private int partition(int[] arr, int start, int end) {
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<end;j++){
			if(pivot>=arr[j]){
				i=i+1;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
			
		}
		if(arr[end]<arr[i+1]){
			int temp=arr[end];
			arr[end]=arr[i+1];
			arr[i+1]=temp;
			
		}
		return i+1;
		
	}

	private void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
}
