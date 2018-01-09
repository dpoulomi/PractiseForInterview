package whatnot.Practise.practiseid;

/*Please generate all combinations of a given string. For example, combinations of a given string
 “abc” are “a”, “b”, “c”, “ab”, “ac”, “bc”, and “abc”.*/
public class CombinationofaString {

	public static void main(String args[]) {

		CombinationofaString cms=new  CombinationofaString();
		String str="abc";
		int end=str.length()-1;
		cms.findCombination(str,0,end);
	}

	private void findCombination(String str, int start, int end) {
		if(start==end){
			System.out.println(str);
		}
		
	}

}
