package hashing;

import java.util.TreeSet;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		unionOfTwoArrays();
	}
	
	static void unionOfTwoArrays() {
		int[] a = {10,20,30,20,50,10};
		int[] b = {10,60,20,10,70};
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i : a) {
			set.add(i);
		}
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		for(int i : b) {
			set.add(i);
		}
		System.out.println(set);
		
		
	}

}
