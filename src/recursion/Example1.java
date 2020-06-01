package recursion;

public class Example1 {

	public static void main(String[] args) {
		example1(3);
	}

	static void example1(int n) {
		if(n<1) {
			return;
		}
		else {
			System.out.print(n+" ");
			example1(n-1);
			System.out.print(n+" ");
		}
	}
}
