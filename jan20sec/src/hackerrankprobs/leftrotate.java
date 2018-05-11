package hackerrankprobs;

import java.util.Scanner;

public class leftrotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		leftrotate(a, d);

	}

	public static void leftrotate(int[] a, int d) {
		reverse(a, 0, d-1);
		reverse(a,d, a.length-1);
		reverse(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void reverse(int[] a, int first, int last) {
		int temp;
		while (first < last) {
			temp = a[first];
			a[first] = a[last];
			a[last] = temp;
			first++;
			last--;
		}
	}
}
