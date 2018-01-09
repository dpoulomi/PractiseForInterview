package whatnot;

public class ArithmeticOperations {
    public static void main(String[] args) {
        ArithmeticOperations arithmeticOperations=new ArithmeticOperations();
        int num1=2;
        int num2=2;
        arithmeticOperations.divide(num1,num2);
    }

    int divide(int num1, int num2) {
        if (num2 == 0)
            throw new ArithmeticException("num2 is zero.");
        boolean minus = false;
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0))
            minus = true;
        if (num1 < 0)
            num1 = add(~num1, 1);
        if (num2 < 0)
            num2 = add(~num2, 1);
        int result = 0;
        for (int i = 0; i < 32; i=add(i, 1)) {
            result = result << 1;
            if ((num1 >> (31 - i)) >= num2) {
                num1 = subtract(num1, num2 << (31 - i));
                result = add(result, 1);
            }
        }
        if (minus)
            result = add(~result, 1);
        return result;
    }

    private int subtract(int num1, int i) {
        return num1-i;
    }

    private int add(int i, int i1) {
        return  i+i1;
    }

}
