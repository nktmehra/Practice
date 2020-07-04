package hashing;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		subArrayWith0SumWithApproach1();
	}
	
	static void subArrayWith0SumWithApproach1() {
		int[] a= {1,4,13,-3,-10,5};
		
		
		for(int i =0;i<a.length;i++) {
			int sum =0;
			for(int j =i;j<a.length;j++) {
				sum = sum + a[j];
				if(sum==0) {
					System.out.println("True");
				}
			}
		}
	}
	
	static void subArrayWith0SumWithApproach2() {
		int[] a= {1,4,13,-3,-10,5};
	}

}
