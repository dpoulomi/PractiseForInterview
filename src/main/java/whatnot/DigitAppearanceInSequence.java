package whatnot;

public class DigitAppearanceInSequence {

    public static void main(String[] args) {
        String match="1";
        int number=121;
        DigitAppearanceInSequence digitAppearanceInSequence=new DigitAppearanceInSequence();
        digitAppearanceInSequence.getNumberofMatches(number, match);
    }

    private void getNumberofMatches(int number, String match) {
        int count = 0;
        for (int i = 0; i <= number; i++) {
          int no=i;
            while (no != 0) {
                if (no % 10 == 1) {
                    count++;
                }
                no = no / 10;
            }

        }

        System.out.println(count);
    }
}
