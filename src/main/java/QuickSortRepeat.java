
public class QuickSortRepeat {

	public static void main(String args[]){
		int arr[]={4,3,1,2};
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		QuickSortRepeat qsr=new QuickSortRepeat();
		
		qsr.quickSort(arr,start, end);
		qsr.printArray(arr);
	}

	private void quickSort(int[] arr,int start, int end) {
		if(end>start){
		int pi=partition(arr,start, end);
		quickSort(arr, start,pi-1);
		quickSort(arr, pi+1,end);
		}
		
		
		
	}

	private int partition(int[] arr,int start, int end) {
		int pi=arr[end];
		int j=start-1;
		for(int i=start;i<end;i++){
			if(pi>=arr[i]){
				j=j+1;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
		
		if(arr[end]<arr[j+1]){
			int temp=arr[j+1];
			 arr[j+1]=arr[end];
			 arr[end]=temp;
			
		}
		return j+1;
	}
	
	private void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
