package array;

public class TrappedRainWater {

	public static void main(String[] args) {
		trappedRainWater();
	}
	
	static void trappedRainWater() {
		int[] arr = {5,0,6,2,3};
		int temp = 0;
		int trap = arr[0];
		int max_element = arr[0];
		int location = 0;
		
		for( int i = 0 ; i<arr.length;i++) {
			if(arr[i]>max_element) {
				max_element=arr[i];
				location =i;
			}
		}
		
		int temp1 = 0;
		int trap1 = arr[location];
		
		for(int i =0 ;i<location;i++) {
				if(trap-arr[i+1] > 0) {
					temp = temp + trap-arr[i+1];
				}
		}
		
		for(int i = arr.length-1 ; i>location;i--) {
			if(arr[i]-arr[i-1] > 0) {
				temp1 = temp1 + arr[i]-arr[i-1];
			}
		}
		System.out.print("Trapped rain water is: ");
		System.out.print(temp+temp1);
	}
	
}
