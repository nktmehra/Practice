package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequenciesOfElements {

	public static void main(String[] args) {
		countFrequencyOfArrayElements();
	}
	
	static void countFrequencyOfArrayElements() {
		int[] arr = {10,10,10,2,2,2,2,2};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0 ;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println("Occurence of "+e.getKey()+ " is "+e.getValue());
		}
		
		
	}

}
