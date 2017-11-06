import java.util.HashMap;
import java.util.Map;


public class CompilationErrorCheck2 {
		public CompilationErrorCheck2(String data) {
		this.data = data;
		}
		private String data;
		
		public static void main(String args[]) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		String str1 = new String("Hello World.");
		String str2 = new String("Hello World.");
		map1.put(str1, new Integer(10));
		map1.put(str2, new Integer(20));
		Map<CompilationErrorCheck2, Integer> map2 = new HashMap<CompilationErrorCheck2, Integer>();
		CompilationErrorCheck2 str3 = new CompilationErrorCheck2(str1);
		CompilationErrorCheck2 str4 = new CompilationErrorCheck2(str2);
		map2.put(str3, new Integer(10));
		map2.put(str4, new Integer(20));
		System.out.println(map1.get(str1));
		System.out.println(map2.get(str3));
		}
}
