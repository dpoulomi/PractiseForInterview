
public class InsertionSortRepeat {

	public static void main(String args[]){
	int arr[] = { 6, 7, 12, 4, 11, 51, 13, 41 };
	InsertionSortRepeat isr = new InsertionSortRepeat();
	isr.insertionSort(arr);
	isr.printArray(arr);
}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
public void insertionSort(int[] arr){
	for(int i=0;i<arr.length;i++){
	while(i>0 && arr[i]<arr[i-1]){
		int temp=arr[i];
		arr[i]=arr[i-1];
		arr[i-1]=temp;
		i--;
	}
	
	}
}
}