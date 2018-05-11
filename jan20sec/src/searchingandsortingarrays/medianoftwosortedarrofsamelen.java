package searchingandsortingarrays;

import java.util.Scanner;

public class medianoftwosortedarrofsamelen {
	public static void findMedian(int[] arr1, int[] arr2, int firsta1, int lasta1, int firsta2, int lasta2) {
		if ((firsta1 + lasta1) / 2 == firsta1 && (firsta2 + lasta2) / 2 == firsta2) {
			int el = Math.max(arr1[firsta1], arr2[firsta2]);
			int el2 = Math.min(arr1[lasta1], arr2[lasta2]);
			int finalMedian;
			if ((arr1.length + arr2.length ) % 2 == 0) {
				finalMedian = (el + el2) / 2;
			} else {
				finalMedian = el;
			}
			System.out.println(finalMedian + "  ");
			return;
		}
		int median1 = arr1[(firsta1 + lasta1) / 2];
		int median2 = arr2[(firsta2 + lasta2) / 2];
		if (median1 > median2) {
			findMedian(arr1, arr2, firsta1, (firsta1 + lasta1) / 2, (firsta2 + lasta2) / 2, lasta2);
		} else if (median2 > median1) {
			findMedian(arr1, arr2, (firsta1 + lasta1) / 2, lasta1, firsta2, (firsta2 + lasta2) / 2);
		} else if (median1 == median2) {
			System.out.println(arr1[median1]);
			return;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arr1 = new int[arraySize];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int arraySize2 = sc.nextInt();
		int[] arr2 = new int[arraySize2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		sc.close();
		int firsta1 = 0;
		int lasta1 = arr1.length;
		int firsta2 = 0;
		int lasta2 = arr2.length;
		findMedian(arr1, arr2, firsta1, lasta1, firsta2, lasta2);
	}

}
