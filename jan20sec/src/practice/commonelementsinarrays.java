package practice;

import java.util.*;

public class commonelementsinarrays {
	public static void main(String[] args) {
		int[] a = { 112, 3, 5, 2, 8, 10, 11 };     
		int[] b = { 2, 4, 8, 15, 20 };
		ArrayList<Integer> c = new ArrayList<Integer>();
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				c.add(a[i]);
				i++;
				j++;
			} else if (a[i] < b[j]) {
				i++;
			} else if (b[j] < a[i]) {
				j++;
			}
		}
		System.out.print(c);

	}

}
