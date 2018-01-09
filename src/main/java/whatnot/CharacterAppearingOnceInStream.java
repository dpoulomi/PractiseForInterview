package whatnot;

public class CharacterAppearingOnceInStream {

    public static void main(String[] args) throws Exception {

        CharacterAppearingOnceInStream charatcterAppearingOnce = new CharacterAppearingOnceInStream();
        String string = "google";
        System.out.println(charatcterAppearingOnce.getCharaterAppearingOnce(string));

    }

    private char getCharaterAppearingOnce(String string) throws Exception {
        int[] occurence = new int[256];
        char ch = ' ';
        for (int i = 0; i < occurence.length; i++) {
            occurence[i] = -1;

        }
        for (int i = 0; i < string.length(); i++) {
            if (occurence[string.charAt(i)] == -1) {
                occurence[string.charAt(i)] = i;
            } else if (occurence[string.charAt(i)] >= 0) {
                occurence[string.charAt(i)] = -2;
            }
        }

        for (int i = 0; i < occurence.length; i++) {
            if (occurence[i] > 0) {
                int index = occurence[i];
                ch = string.charAt(index);
                break;

            }


        }
        return ch;
    }

}
