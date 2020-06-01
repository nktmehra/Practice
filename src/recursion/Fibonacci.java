package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonnaci(0));
	
	}
	static int fibonnaci(int n) {
		if(n==0) {
			return 0;
		}
		if(n<=2) {
			return 1;
		}
		int fib = fibonnaci(n-1)+fibonnaci(n-2);
		return fib;
	}
} 

	


