package recursion;

public class Example2 {

	public static void main(String[] args) {
		example2(5);
		example2_1(5);
	}
	
	static void example2(int n) {
		if(n<1) {
			return;
		}
		System.out.print(n+" ");
		example2(n-1);
	}
	
	static void example2_1(int n) {
		if(n<1) {
			return;
		}
		example2_1(n-1);
		System.out.print(n+" ");
	}
}
