
public class ReplaceString {

	public static void main(String args[]){
		
		String s="I am happy";
		ReplaceString rs=new ReplaceString();
		rs.replace(s);
				
	}

	private void replace(String s) {
		
		int originalStringLength=s.length();
		int newStringLength=originalStringLength+2*2;
		int originalIndex=originalStringLength-1;
		int newIndex=newStringLength-1;
		char arr[]=new char[newStringLength];
		for(int i=0;i<s.length();i++){
			arr[i]=s.charAt(i);
		}
		
		while(originalIndex>0 && newIndex >originalIndex){
			if(arr[originalIndex]==' '){
				arr[newIndex--]='0';
				arr[newIndex--]='2';
				arr[newIndex--]='%';
				
			}else{
				
				arr[newIndex --] = arr[originalIndex];
			}
			
			-- originalIndex;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}	
		
}
