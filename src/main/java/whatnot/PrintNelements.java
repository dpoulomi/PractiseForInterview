package whatnot;

public class PrintNelements {
    public static void main(String[] args) {
        int n = 3;
        PrintNelements printNelements = new PrintNelements();
       boolean flag= printNelements.printNelements(n);

    }

    private boolean printNelements(int n) {
        int num = 1;
        boolean isOverflow = false;
        int carry = 0;
        for (int i = 0; i < n; i++) {
            num = num * 10;
        }
        char arr[] = new char[num - 1];
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] - '0' + carry;
            if (i == n - 1)
                sum++;
            if (sum >= 10) {
                if (i == 0)
                    isOverflow = true;
                else {
                    sum -= 10;
                    carry = 1;
                    arr[i] = (char) ('0' + sum);
                }
            } else {
                arr[i] = (char) ('0' + sum);
                break;
            }
        }
        return isOverflow;
    }

    void PrintNumber(char number) {
        char pChar = number;
        while (pChar == '0')
            ++pChar;
        if (pChar != '\0') ;
        System.out.println(pChar);
    }

}



