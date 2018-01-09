package whatnot.Practise.practiseid;
import java.util.ArrayList;

public class Mergesort {
	public static void main(String args[]) {

		int arr1[] = { 1, 7, 9, 10 };
		int arr2[] = { 2, 5, 6, 8 };
		Mergesort mg = new Mergesort();
		mg.merge(arr1, arr2);
	}

	public void merge(int arr1[], int arr2[]) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		int count = arr1.length;
		int count1 = arr2.length;
		while (i < count || j < count1) {
			if (arr1[i] < arr2[j]) {
				l1.add(arr1[i]);
				if (i < arr1.length) {
					i++;
				}
			//	fromFirstArray(arr1,l1,i);
				
			}
			else {
			//	fromSecondArray(arr1,l1,i);
				l1.add(arr2[j]);
				if (j < arr2.length) {
					j++;
				}
			}
		}
		//l1.forEach(System.out::println);
	}
	
	/*public void fromFirstArray(int arr1[],ArrayList<Integer> l1,int i){
		l1.add(arr1[i]);
		if (i < arr1.length) {
			i++;
		}
		
	}*/
/*public void fromSecondArray(int arr2[],ArrayList<Integer> l1,int j){
	l1.add(arr2[j]);
	if (j < arr2.length) {
		j++;
	}*/
		
	}

