package array;

public class MajotiyElement {

	public static void main(String[] args) {
		majorityElement();
	}

	static void majorityElement() {
		int[] arr = { 3, 8, 4, 8, 8, 8 };
		int res = 0;
		int i;
		int temp = 0;
		for (i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
				res = Math.max(res, count);
				temp = res;
			}
		}
		System.out.println(res);

		if (res == temp) {
			System.out.println(arr[i]);
		}

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == 8) {

				System.out.print(k + " ");

			}
		}
	}
}
