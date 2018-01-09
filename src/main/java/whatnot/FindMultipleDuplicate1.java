package whatnot;

import java.util.ArrayList;
import java.util.List;


public class FindMultipleDuplicate1 {

	public static void main(String args[]){
		List<Integer> l = new ArrayList<Integer>();
		int arr[] = { 2, 3, 1, 0, 2, 5, 3,5,1 };
		
		for (int i = 0; i < arr.length; i++) {
			while (i != arr[i]) {
				int temp = arr[i];
				if(temp!=arr[temp]){
				arr[i] = arr[arr[i]];
				arr[temp] = temp;
				}
				else{
					break;
				}
			}
			if(i != arr[i] && arr[i]==arr[arr[i]]){
				l.add(arr[i]);
			}
		}
		for (int i : l) {
			System.out.println("the duplicate no is : " + i);
		}
	}
}
