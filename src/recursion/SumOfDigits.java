package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(2532));
	}

	static int sumOfDigits(int n) {
		if (n <= 0) {
			return n;
		} else {
			return sumOfDigits(n / 10) + n % 10;
		}
	}
}
