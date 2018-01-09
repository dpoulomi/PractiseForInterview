package whatnot;

public class MergeSortedArrayWithoutThirdArray {
	public static void main(String args[]) {
		int arr1[] = {1,2,3,4,10};
		int arr2[] = {5,6,7,8,11};
		int index1=arr1.length-1;
		int index2=arr2.length-1;
		int indexMerged=arr1.length+arr2.length-1;
		if(arr1==null && arr2==null){
			return;
		}
		while(index1 >= 0 && index2 >= 0) {
			if(arr1[index1] >= arr2[index2])
			arr1[indexMerged--] = arr1[index1--];
			else
			arr1[indexMerged--] = arr2[index2--];
			}
			while(index2 >= 0)
			arr1[indexMerged--] = arr2[index2--];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}
}
