package array;

public class LeftRotateByDSpaces {

	public static void main(String[] args) {
		leftRotateByDSpace();
	}
	
	
	static void leftRotateByDSpace() {
		int[] arr = {1,2,3,4,5,6,7,8};
		int d = 2;
		int[] temp = new int[d];

		 for(int i =0 ;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
		 temp[0] = arr[0];
		 temp[1] = arr[1];
		 
		 System.out.println("\n");
		 
		 for(int i =0;i<arr.length-2;i++) {
			 arr[i] = arr[i+2];
		 }
		 
		 arr[arr.length-2] = temp[0];
		 arr[arr.length-1] = temp[1];
		 
		 for(int i =0 ;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
		 
	}
}
