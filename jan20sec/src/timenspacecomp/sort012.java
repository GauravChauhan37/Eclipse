package timenspacecomp;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class sort012 {
	// dutch national flag
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int low = 0;
		int mid = 0;
		int high = a.length - 1;
		while (mid <= high) {
			if (a[mid] == 1) {
				mid++;
			} else if (a[mid] == 0) {
				int temp = a[mid];
				a[mid] = a[low];
				a[low] = temp;
				low++;
				mid++;
			} else if (a[mid] == 2) {
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
			}
		}
		for (int val : a) {
			System.out.print(val + " ");
		}
	}

}
