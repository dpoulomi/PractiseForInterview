package whatnot;

public class Power {
    public static void main(String[] args) {
        double base = 2;
        int exp = 3;
        Power power = new Power();
        System.out.println(power.calculatePow(base, exp));

    }

    private double calculatePow(double base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        double result = calculatePow(base, exp / 2);
        result *= result;
        if (exp % 2 == 1) {
            result *= base;
        }

        return result;
    }
}
