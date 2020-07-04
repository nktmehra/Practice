package hashing;

import java.util.HashSet;

public class CountDistinctElementInEveryWindow {

	public static void main(String[] args) {
		countDistinctElementInEveryWindow();
	}
	
	static void countDistinctElementInEveryWindow() {
		int[] a= {10,10,5,3,10,5};
		int k =4;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i =0;i<=k;i++) {
			set.add(a[i]);
			
		}
		System.out.println(set.size());
	}

}
