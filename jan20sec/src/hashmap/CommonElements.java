package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 3, 2, 2, 4, 5 };
		int[] arr2 = { 1, 1, 2, 2, 5 };
		CommonElements(arr1, arr2);
	}
//
//	private static void CommonElements(int[] arr1, int[] arr2) {
//		HashMap<Integer, Integer> first = new HashMap<>();
//		HashMap<Integer, Integer> scnd = new HashMap<>();
//		for (int i = 0; i < arr1.length; i++) {
//			first.put(arr1[i], first.containsKey(arr1[i]) ? first.get(arr1[i]) + 1 : 1);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			int key = arr2[i];
//			scnd.put(key, scnd.containsKey(key) ? scnd.get(key) + 1 : 1);
//		}
//		ArrayList<Integer> al = new ArrayList<>(first.keySet());
//		for (int i = 0; i < al.size(); i++) {
//			if (first.get(al.get(i)) == scnd.get(al.get(i))) {
//				System.out.print(al.get(i) + " ");
//			}
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < al.size(); i++) {
//			if (first.get(al.get(i)) == scnd.get(al.get(i))) {
//				int freq = Math.min(first.get(al.get(i)), scnd.get(al.get(i)));
//				while (freq != 0) {
//					System.out.print(al.get(i) + " ");
//					freq--;
//				}
//			}
//		}
//	}

	private static void CommonElements(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hp = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			hp.put(arr1[i], hp.containsKey(arr1[i]) ? hp.get(arr1[i]) + 1 : 1);
		}
		for(int i=0;i<arr2.length;i++){
			if(hp.containsKey(arr2[i])){
				
			}
		}
	}
}
