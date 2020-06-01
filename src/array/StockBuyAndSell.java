package array;

public class StockBuyAndSell {

	public static void main(String[] args) {
		method1();
	}
		
	static void method1() {
		int[] arr = {1,5,3,8,12};
		int profit = 0;
		for(int i = 1 ;i<arr.length;i++) {
			if(arr[i] >arr[i-1]) {
				profit = profit + arr[i] - arr[i-1];
			}
		}
		System.out.println(profit);
	}
}
