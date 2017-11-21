package Practise.practiseid;

/*Please implement the function double Power(double base, int exponent) to raise a
 number base to power of exponent. You are not allowed to call library functions, and it is not necessary to take
 care of overflow issues.*/
public class DoublePower {

	public static void main(String args[]) {
		int number = 3;
		int pwer = 5;
		DoublePower dp = new DoublePower();
		int product = dp.pwer(number, pwer);
		System.out.println(product);

	}

	private int product = 1;

	/*private int pwer1(int number, int power) {
		if (power == 0) {
			return 1;
		}
		if (power == 1) {
			return number;
		}

		if (power % 2 == 0 && power != 1) {
			product = pwer(number, power / 2) * pwer(number, power / 2);
		} else if (power % 2 != 0) {
			product = pwer(number, power / 2) * pwer(number, power / 2)
					* number;
		}
		return product;
	}*/
	
	private int pwer(int number, int power) {
		if (power == 0) {
			return 1;
		}
		product=pwer(number, power / 2);
		if (power % 2 == 0) {
			product = product * product;
		} else if (power % 2 != 0) {
			product = product * product
					* number;
		}
		return product;
	}
}
