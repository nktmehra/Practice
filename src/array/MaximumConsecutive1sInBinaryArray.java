package array;

public class MaximumConsecutive1sInBinaryArray {

	public static void main(String[] args) {
		countInBinaryArray();
	}
	
	static void countInBinaryArray() {
		int[] arr = {1,0,1,1,1,1,0,1,1};
		int count = 0;
		int res = 0;
		
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i] == 0) {
				count = 0;
			}else {
				count++;
				res = Math.max(res, count);
			}
		}
		System.out.println(res);
	}
}
