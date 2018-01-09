package whatnot.Practise.practiseid;


public class BubbleSort {
public static void main(String args[]){
	
	int arr[] = {21, 15, 12, 10 ,9,7};
	BubbleSort bs = new BubbleSort();
	bs.bubbleSort(arr);
}

public boolean checkIfSorted(int arr[]){
	for(int i=0;i<arr.length-1;i++){
		if(arr[i]>arr[i+1]){
			return true;
		}
		}
	return false;
}
public void bubbleSort(int arr[]){
	for(int i=0;i<arr.length-1;i++){
		if(arr[i]>arr[i+1]){
		int	temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
	}
	boolean flag=checkIfSorted(arr);
	if(flag){
		bubbleSort(arr);
	}else{
	for(int element:arr){
		System.out.println(element);
	}
	}
}
}
