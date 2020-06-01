package array;

public class LeftRotateArrayByOne {

	public static void main(String[] args) {
			leftRotateArrayByOne();
			System.out.println("\n");
			leftRotateArrayByOne();
	}
	
	 static void leftRotateArrayByOne() {
		 int[] arr = {1,2,3,4,5};
		 
		 for(int i =0 ;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
		 
		 int temp = arr[0];
		 
		 for(int i= 0;i<arr.length-1;i++) {
			 arr[i] = arr[i+1];
		 }
		 arr[arr.length-1] = temp;
		 
		 System.out.println("\n");
		 
		 for(int i =0 ;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
	 }

}
