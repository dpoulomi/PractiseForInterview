package whatnot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMultipleDuplicate {

	public static void main(String args[]) {
		int arr[] = { 2, 3, 1, 0, 2, 5, 3 };
		Set<Integer> s = new HashSet<>();
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!s.contains(arr[i])) {

				s.add(arr[i]);
			} else {
				l.add(arr[i]);
			}
		}
		for (int i : l) {
			System.out.println("the duplicate no is : " + i);
		}
	}
}
