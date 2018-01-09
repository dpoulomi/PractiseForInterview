package whatnot;

public class HeapSortRepeat2 {


	public static void main(String args[]){
		int arr[]={3,5,1,6,2};
		HeapSortRepeat2  hps=new HeapSortRepeat2();
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--){
			hps.heapify(arr,i,n);
			
		}
		
		for(int i=n-1;i>=0;i--){
			int temp=arr[0];
			 arr[0]=arr[i];
			 arr[i]=temp;
			 hps.heapify(arr, 0, i);
			
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			
		}
		
	}

	private void heapify(int[] arr, int i, int n) {
		int max=arr[i];
		int leftNode=2*i+1;
		int rightNode=2*i+2;
		int index=0;
		if(leftNode<n && max<arr[leftNode]){
			max=arr[leftNode];
			index=leftNode;
		}
		if(rightNode<n && max<arr[rightNode]){
			max=arr[rightNode];
			index=rightNode;
		}
		
		if(max!=arr[i]){
			int temp=arr[i];
			arr[i]=max;
			arr[index]=temp;
			heapify(arr, index, n);
		}
		
	
	}
}
