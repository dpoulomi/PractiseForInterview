package whatnot;

/**
 *
 */
public class Anagrams {

    public static void main(String[] args) {
        String str1="live";
        String str2="evill";
        Anagrams anagrams=new Anagrams();
      System.out.println(anagrams.checkAnagrams(str1,str2));
    }

    private boolean checkAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        int[] hastable=new int[256];
        for(int i=0;i<str1.length();i++){
            hastable[str1.charAt(i)]++;
        }

        for(int i=0;i<str2.length();i++){
            if(hastable[str2.charAt(i)]==0 ){
                return false;
            }
            hastable[str2.charAt(i)]--;
        }

        return true;
    }
}
