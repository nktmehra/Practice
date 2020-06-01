package array;

public class LongestEvenOddSubArray {

	public static void main(String[] args) {
		longestEvenOddSubArray();
		longestEvenOddSubArrayMethod2();
	}

	static void longestEvenOddSubArray() {
		int[] arr = { 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int res = 1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {

				if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0) && (arr[j - 1] % 2 == 0)) {
					count++;
				}else {
				break;
				}
			}
			res = Math.max(res, count);
		}
		System.out.println(res);
	}
	
	static void longestEvenOddSubArrayMethod2() {
		int[] arr = { 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int res = 1;
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
				if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0) && (arr[i - 1] % 2 == 0)) {
					count++;
				}else {
					count = 1;
				}
				
			res = Math.max(res, count);
		}
		System.out.println(res);
	}
}
