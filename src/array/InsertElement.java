package array;

public class InsertElement {

	public static void main(String[] args) {
		insertElement(1, 40);
		
	}
	
	static void insertElement(int location, int value) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
		
		System.out.println(arr.length);
		if(location>arr.length) {
			System.out.println("Location is greater than size of the array");
		}
		
		
		  for(int i=arr.length-1;i>0 ;i--) {
			  
			  arr[i] = arr[i-1];
			  if(i==location) {
				  arr[i] = value;
				  
			  }
			 
		  }
		  
		  for(int i =0 ;i<arr.length;i++) {
				System.out.println("Value of " +i +" is "+arr[i]);
			}
			
		 
	}

}
