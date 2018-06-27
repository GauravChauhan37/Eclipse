package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsElementsSequence {

	public static void maxLengthSeq(int[] arr) {
		HashMap<Integer, Boolean> hp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hp.put(arr[i], true);
		}
		for (int i = 0; i < arr.length; i++) {
			if (hp.containsKey(arr[i] - 1)) {
				hp.put(arr[i], false);
			}
		}
		int ovlen = 0;
		int ovsp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (hp.get(arr[i]) == true) {

				int len = 0;
				int start = arr[i];
				while (hp.containsKey(len + start)) {
					len++;
				}
				if (len > ovlen) {
					ovlen = len;
					ovsp = start;
				}
			}
		}
		for (int i = 0; i < ovlen; i++) {
			System.out.print(ovsp + i + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 7, 10, 11, 8, 9 };
		maxLengthSeq(arr);
	}
}
