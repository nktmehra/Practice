package array;

public class DeleteElementArray {

	public static void main(String[] args) {
		deleteElementByLocation(1);
	}
	
	static void deleteElementByLocation(int location) {
		int[] arr = {10,20,30,40,50};
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
		
		
		for(int i = 0;i<arr.length;i++ ) {
			if(i > location ) {
			arr[i-1] = arr[i];
			}
			
		}
		
		System.out.println("****************************");

		for(int i =0 ;i<arr.length;i++) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
		
	}
	
	
	
}

