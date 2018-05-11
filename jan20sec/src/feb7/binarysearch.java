package feb7;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int f = sc.nextInt();
		int[] a = { 10, 205, 300, 440, 900, 4199 };
		int end = a.length - 1;
		int start = 0;
		System.out.println(binarysearch(a, start, end, f));
	}

	public static int binarysearch(int[] a, int start, int end, int f) {
		int mid = 0;
		mid = (start + end) / 2;
		if (a[mid] == f) {
			return mid;
		}
		while (start < end) {
			if (f > a[mid]) {
				start = mid + 1;
				mid = (start + end) / 2;
			} else if (f < a[mid]) {
				end = mid - 1;
				mid = (start + end) / 2;
			} else {

				return mid;
			}
		}
		return -1;
	}

}
