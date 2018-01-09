package whatnot.Practise.practiseid;


/*Please print all permutations of a given string. For example, 
print “abc”, “acb”, “bac”, “bca”,
“cab”, and “cba” when given the input string “abc”.*/
public class PermutationsofaString {
public static void main(String args[]){
	PermutationsofaString ps=new PermutationsofaString();
	String string="abc";
	int count=string.length();
	ps.findPermutations(string,0,count-1);
	
}

	private void findPermutations(String string, int start, int end) {
		if (start == end) {
			System.out.println(string);
		}
		for (int i = start; i <= end; i++) {
			 string=swap(string,start,i);
			findPermutations(string, start+1, end);
			string=swap(string, start, i);
		}
	}

	private String swap(String string, int i, int j) {
		char temp;
		char[] arr=string.toCharArray();
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return String.valueOf(arr);
	}
	
}
