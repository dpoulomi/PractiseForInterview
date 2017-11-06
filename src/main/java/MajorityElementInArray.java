import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*How do you find the majority element in an array when it exists? The majority is an element
that occurs for more than half of the size of the array.
For example, the number 2 in the array {1, 2, 3, 2, 2, 2, 5, 4, 2} is the majority element because it appears five
times and the size of the array is 9.*/
public class MajorityElementInArray {

	public static void main(String args[]){
		Integer arr[]={1, 2, 3, 2, 2, 2, 5, 4, 2};
		MajorityElementInArray majorityElementInArray=new MajorityElementInArray();
		Integer element=majorityElementInArray.getMajorityElement(arr);
		System.out.print(element);
		
	}

	private Integer getMajorityElement(Integer[] arr) {
		Map storeElements=new HashMap<>();
		int count=0;
		int numberOfRepeatations=0;
		int duplicateNumber=0;
		for(int i=0;i<arr.length-1;i++){
			count=0;
			if(storeElements.containsKey(arr[i])){
				count++;
			}//else{
			storeElements.put(arr[i], count);
		//	}
		}
		
		    Iterator it = storeElements.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        
		    }
		
		
		
			
		
		
		return 0;
	}
}
