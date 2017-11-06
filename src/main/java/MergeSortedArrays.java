
public class MergeSortedArrays {
public static void main(String args[]){
//	int arr1[]=new int[10];
	int arr1[]={3,5,7,9,19,0,0,0,0,0};
	int arr2[]={1,2,6,10,12};
	
	MergeSortedArrays mergeSortedArrays=new MergeSortedArrays();
	mergeSortedArrays.mergeArrays(arr1, arr2);
	for(int i=0;i<arr1.length;i++){
		System.out.println(arr1[i]);
	}
	
	
}

private void mergeArrays(int[] arr1, int[] arr2) {
	// TODO Auto-generated method stub
	
	int arraySize1=arr1.length-1;
	int arraySize2=arr2.length;
	int array1Index=4;
	int array2Index=arraySize2-1;
	
	while(array1Index>=0 && array2Index>=0){
		if(arr1[array1Index]>arr2[array2Index]){
			arr1[arraySize1]=arr1[array1Index];
			array1Index--;
			
			
		}else{
			arr1[arraySize1]=arr2[array2Index];
			array2Index--;
			
		}
		arraySize1--;
		
	}
	
	while(array1Index>=0){
		arr1[arraySize1]=arr1[array1Index];
		array1Index--;
		arraySize1--;
	}
	
	while(array2Index>=00){
		arr1[arraySize1]=arr2[array2Index];
		array2Index--;
		arraySize1--;
	}
}
}
