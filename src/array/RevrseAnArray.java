package array;

public class RevrseAnArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		reverArray(arr);
		System.out.println("*************************************");
		reverseArrayBySwapping();
	}
	
	
	static void reverArray(int [] arr) {
		for(int i =arr.length-1;i>0;i--) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
	}
	
	static void reverseArrayBySwapping() {
		int[] arr = {10,6,5,3,8};
		int temp = 0;
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			temp = arr[low];
			arr[low]= arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
				
	}
}
