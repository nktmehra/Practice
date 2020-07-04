package hashing;

import java.util.Set;
import java.util.TreeSet;

public class CountDistinctElements {

	public static void main(String[] args) {
		countDistinctElements();
	}
	
	static void countDistinctElements() {
		int[] arr = {10,12,12,15,16,17,15};
	
		Set<Integer> set = new TreeSet<Integer>();
		for(int i : arr) {
			set.add(i);
		}
		System.out.println("The number of Distinct elements -->"+set.size());
		System.out.println("Distinct elements are -->"+set);
		
	}

}
