package searching;

public class BinarySearch {

	public static void main(String[] args) {
		binarySearch();
	}

	static void binarySearch() {
		int[] arr = { 10, 20, 30, 40, 50, 60,70};
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;
		int search = 10;
		while (low <= high) {
			if (arr[mid] == search) {
				System.out.println("Location of searched element is " + mid);
					break;
			} else if (arr[mid] > search) {
				high = mid-1;
			} else {
				low = mid+1;
			}
			mid = (low + high) / 2;
		}

	}

}
