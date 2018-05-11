package searchingandsortingarrays;

import java.util.Arrays;

public class sortanarracctocountofsetbitsdecreasing {
	static class count implements Comparable<count> {
		int value;
		int index;

		public int compareTo(count val) {
			return val.value - this.value;
		}
	}

	public static int checksetbits(int a) {
		int c = 0;
		while (a != 0) {
			if ((a & 1) != 0) {
				c += 1;
				a = a >> 1;
			} else {
				a = a >> 1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		
		int[] a = { 5, 6, 1, 2, 9, 10, 15, 2, 4 };
		
		count[] arr = new count[a.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new count();
		}
		for (int i = 0; i < a.length; i++) {
			int setbit = checksetbits(a[i]);
			arr[i].value = setbit;
			arr[i].index = i;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
		
				System.out.println(a[arr[i].index] + " ");
		}
	}
}
