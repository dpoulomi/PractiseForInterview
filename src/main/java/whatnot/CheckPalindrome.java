package whatnot;

public class CheckPalindrome {

	
	public static void main(String args[]){
		CheckPalindrome cp= new CheckPalindrome();
		Integer num=222222;
		boolean flag=cp.checkIfPalindrome(num);
		System.out.println(flag);
	}

	private boolean checkIfPalindrome(Integer num) {
		int reveredNumber=0;
		int no=num;
			String nu=num.toString();
			for(int i=0;i<nu.length();i++){
				reveredNumber=reveredNumber * 10 + num% 10;
				num=num/10;
			}
			if(reveredNumber==no){
				return true;
			}
		return false;
	}
}
