package whatnot;

public class CharacterAppearingOnce {

    public static void main(String[] args) throws Exception {

        CharacterAppearingOnce charatcterAppearingOnce = new CharacterAppearingOnce();
        String string = "google";
        charatcterAppearingOnce.getCharaterAppearingOnce(string);

    }

    private void getCharaterAppearingOnce(String string) {

        int count=256;
        int arr[]=new  int[count];
       for(int i=0;i<string.length();i++){

           arr[string.charAt(i)]++;
       }

       for(int i=0;i<string.length();i++){
           if(arr[string.charAt(i)]==1){
               System.out.println(string.charAt(i));
            break;
           }


       }
    }
}
