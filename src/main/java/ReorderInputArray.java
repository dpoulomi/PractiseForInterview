/*Please reorder an input array to place all odds before evens. For example, after numbers in the
array {1, 2, 3, 4, 5} are reordered, it looks like {1, 5, 3, 4, 2}. The result is not unique, and there are multiple arrays
meeting the reordering criteria.*/
public class ReorderInputArray {
public static void main(String args[]){
	ReorderInputArray re=new ReorderInputArray();
	int arr[]={1,2,3,4,5};
	re.reorderArray(arr);
	
	
}

private void reorderArray(int[] arr) {
	int j=arr.length-1;
	int i=0;
	while(i!=j){
		if(arr[i]%2==0 && arr[j]%2!=0){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}else if(arr[i]%2!=0 && arr[j]%2!=0){
			i++;
		}else if(arr[i]%2!=0 && arr[j]%2==0 && (j==i+1)){
			i++;
		}
		
	}
	
	for(int k=0;k<=arr.length-1;k++){
		System.out.println(arr[k]);
	}
	
}
}
