package hashing;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,20,40,50,40};
		int[] arr2 = {20,30,20,40,30};
		intersectionOfTwoArrays(arr1,arr2);
	}

	static void intersectionOfTwoArrays(int[] arr1, int[] arr2) {

		int res =0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0 ; i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		System.out.println(set);
		for(int i =0;i<=set.size();i++) {
			if(set.contains(arr2[i])) {
				res++;
				set.remove(arr2[i]);
			}
		}
		System.out.println(res);
		System.out.println(set);
	}
	
}
