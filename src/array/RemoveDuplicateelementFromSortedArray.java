package array;

public class RemoveDuplicateelementFromSortedArray {

	public static void main(String[] args) {
		removeDuplicateElement();
		removeDuplicates();
	}
	
	static void removeDuplicateElement() {
		int[] arr = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 30;
		arr[5] = 30;
		
		for(int i =0 ;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++ ) {
				if(arr[i]==arr[j]) {
					arr[j] =0;
				}
			}
		}
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
		
		System.out.println("****************************************");
		for(int i =0 ;i<arr.length-1;i++) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
		
	}
	
	static void removeDuplicates() {
		int[] arr = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 30;
		arr[5] = 30;
		
		int result = 1;
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i]!=arr[result-1]) {
				arr[result] = arr[i];
				result++;
			}
	}
		System.out.println("The size of distinct elements are :"+result);
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.println("Value of " +i +" is "+arr[i]);
		}
	}

}
