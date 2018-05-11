package searchingandsortingarrays;

import static java.lang.Math.abs;

public class finddupseff {
	public static void findDups(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[abs(arr[i])] > 0) {
				arr[abs(arr[i])] = -arr[abs(arr[i])];
			} else {
				System.out.print(abs(arr[abs(arr[i])]) + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2, 4, 3 };
		findDups(arr);
	}

}
