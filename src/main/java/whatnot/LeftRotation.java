package whatnot;

public class LeftRotation {

    public static void main(String[] args) {
        String s = "abcdefg";
        int no = 2;
        LeftRotation leftRotation = new LeftRotation();
        leftRotation.leftRotation(s, no);
    }

    private void leftRotation(String s, int no) {
        int i = 0;
        int j = no - 1;
        char[] arr = s.toCharArray();
        reverseString(i, j, arr);
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();
        i = no;
        j = arr.length - 1;
        reverseString(i, j, arr);

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();
        i = 0;
        j = arr.length - 1;
        reverseString(i, j, arr);
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private void reverseString(int i, int j, char[] arr) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
