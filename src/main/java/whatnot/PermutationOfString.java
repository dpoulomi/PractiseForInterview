package whatnot;

public class PermutationOfString {

    public static void main(String[] args) {
        PermutationOfString permutationOfString = new PermutationOfString();
        String str = "abc";
        int start = 0;
        int end = str.length() - 1;
        permutationOfString.findPermutations(str, start, end);
    }

    private void findPermutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        }
        for (int i = start; i <= end; i++) {

            str = swap(str, start, i);
            findPermutations(str, start + 1, end);
            str = swap(str, start, i);
        }
    }


    private String swap(String str, int i, int j) {
        char arr[] = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

}
