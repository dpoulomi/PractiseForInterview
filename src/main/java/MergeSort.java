
public class MergeSort {

	public static void main(String args[]){
		int arr[]={6,7,12,4,11,51,13,41};
		MergeSort qs1=new MergeSort();
		int start=0;
		int end=arr.length-1;
		qs1.mergeSort(arr,start, end);
		qs1.printArray(arr);
	}
	
	private void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	private void mergeSort(int[] arr, int start, int end) {
		if(end>start){
			int mid=(start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
		
	}

	private void merge(int[] arr, int start, int middle, int end) {
		int n1=middle-start+1;
		int n2=end-middle;
		int l1[]=new int[n1];
		int l2[]=new int[n2];
		for(int i=0;i<n1;i++){
			l1[i]=arr[start+i];
		}
		for(int j=0;j<n2;j++){
			l2[j]=arr[middle+1+j];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1 && j<n2){
			if(l1[i]<l2[j]){
			arr[k]=l1[i];
			i++;
			}
			else{
				arr[k]=l2[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k]=l1[i];
			i++;
			k++;
		}
		
		while(j<n2){
			arr[k]=l2[j];
			j++;
			k++;
		}
	}
}
