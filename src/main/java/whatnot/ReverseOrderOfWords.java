package whatnot;

public class ReverseOrderOfWords {
    public static void main(String[] args) {
        String s = "I am a student";
        ReverseOrderOfWords reverseOrderOfWords = new ReverseOrderOfWords();
        reverseOrderOfWords.reverseWords(s);

    }

    private void reverseWords(String s) {
        int length = s.length() - 1;
        int j = 0;
        char[] arr = s.toCharArray();
        reverseSentence(arr, j, length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int i = 0;
        j = 0;
        while (i<=length && arr[i] != '\0') {
            if (arr[i] == ' ') {
                reverseSentence(arr, j, i-1);
                j=i+1;
            }
            i++;
        }
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    private void reverseSentence(char[] arr, int j, int length) {
        for (int i = length; i >= j; i--) {

            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j++;
        }
    }
}
