package whatnot;

public class SelectionSortRepeat {

	public static void main(String args[]){
		int arr[] = { 6, 7, 12, 4, 11, 51, 13, 41 };
		SelectionSortRepeat isr = new SelectionSortRepeat();
		isr.selectionSort(arr);
		isr.printArray(arr);
	}
	
	private void selectionSort(int[] arr) {
		
		for(int j=0;j<arr.length;j++){
			int referenceElement=arr[j];
		for(int i=j+1;i<arr.length;i++){
			if(referenceElement>arr[i]){
				referenceElement=arr[i];
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			
				
			}
			
		}
		
	}	
		
	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
