package array;

public class LeadersInArray {

	public static void main(String[] args) {
			leadersInArray();
	}
	
	static void leadersInArray() {
		int[] arr = {7,10,4,6,5,2};
		
		int i = 0;
		while(i<arr.length-1) {
			int j = i;
			if(arr[i]>arr[j+1]) {
				j++;
			}
			i++;
			System.out.println(arr[i]);
		}
	}
}
