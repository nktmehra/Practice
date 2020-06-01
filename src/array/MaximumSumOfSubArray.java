package array;

public class MaximumSumOfSubArray {

	public static void main(String[] args) {
		maxSumOfSubArray();
	}
	
	static void maxSumOfSubArray() {
		int[] arr = {2,3,-8,7,-1,2,3};
		int res = 0;
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j = i;j<arr.length;j++) {
				sum = sum+ arr[j];
				res=Math.max(res, sum);
			}
		}
		System.out.println(res);
	}
}
