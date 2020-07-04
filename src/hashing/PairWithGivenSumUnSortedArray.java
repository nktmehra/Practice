package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class PairWithGivenSumUnSortedArray {

	public static void main(String[] args) {
		pairWithGivenSumUnSortedArrayByApproach1();
		pairWithGivenSumUnSortedArrayByApproach2();
	}

	static void pairWithGivenSumUnSortedArrayByApproach1() {
		int[] a = { 3, 2, 8, 15, -8 };
		int sum = 17;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println("True");
				}

			}
		}

	}
	
	static void pairWithGivenSumUnSortedArrayByApproach2() {
		int[] a = {6,5,11};
		int sum = 16;
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0;i<a.length;i++) {
			if(set.contains(sum-a[i])) {
				System.out.println("True");
			}else {
				set.add(a[i]);
			}
		}
	}

}
