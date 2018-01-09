package whatnot;

public class QuickSort1 {
public static void main(String args[]){
	int arr[]={6,7,12,4,11,51};
	QuickSort1 qs1=new QuickSort1();
	int start=0;
	int end=arr.length-1;
	qs1.quickSort(arr,start, end);
	qs1.printArray(arr);
	
	
}

public int partition(int[] arr,int start, int end){
	int pivot=arr[end];
	int i=start-1;
	for(int j=start;j<end;j++){
	
		if(pivot>=arr[j]){
			if(i<0){
				i++;
			}else{
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			}
		}
	}
	int temp=arr[end];
	arr[end]=arr[i+1];
	arr[i+1]=temp;
	
	 return i+1;
		
	}



private void quickSort(int[] arr,int start, int end) {
	if(end>start){
	int pi=partition(arr,start, end);
	quickSort(arr, start, pi-1);
	quickSort(arr, pi+1, end);
	}
	
}

private void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}

}