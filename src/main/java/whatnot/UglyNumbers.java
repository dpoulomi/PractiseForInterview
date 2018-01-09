package whatnot;

public class UglyNumbers {

    public static void main(String[] args) {
        int n = 10;
        UglyNumbers uglyNumbers = new UglyNumbers();
        uglyNumbers.getNthUglyNumber(n);
    }

    private void getNthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int mul2 = ugly[i2] * 2;
        int mul3 = ugly[i3] * 3;
        int mul5 = ugly[i5] * 5;
        int nextUglyNo=0;

        for (int i = 1; i < n; i++) {

             nextUglyNo = Math.min(mul2, Math.min(mul3, mul5));
            ugly[i] = nextUglyNo;
            if (nextUglyNo == mul2) {
                i2 = i2 + 1;
                mul2 = ugly[i2] * 2;

            }
            if (nextUglyNo == mul3) {
                i3 = i3 + 1;
                mul3 = ugly[i3] * 3;

            }
            if (nextUglyNo == mul5) {
                i5 = i5 + 1;
                mul5 = ugly[i5] * 5;

            }
        }

        System.out.println(nextUglyNo);
    }
}
