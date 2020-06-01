package array;

public class MaximumDiffernece {

	public static void main(String[] args) {
		maxDifferenceMethod1();
	}
	
	static void maxDifferenceMethod1() {
		int[] arr = {2,10,3,4,6,11};
		int res = arr[1] - arr[0];
		for(int i = 0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				res = Math.max(res, arr[j] - arr [i]);
			}
		}
		System.out.println(res);
	}
}
