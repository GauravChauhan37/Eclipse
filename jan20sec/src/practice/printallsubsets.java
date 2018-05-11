package practice;

import java.util.Arrays;
import java.util.Scanner;

public class printallsubsets {

	static void printSubsets(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < (n * n - 1); i++) {
			System.out.print("{ ");

			for (int j = 0; j < n; j++)
				if ((i & (1 << j)) > 0)
					System.out.print(a[j] + " ");
			count++;
			System.out.println("}");
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int some = sc.nextInt();
			a[i] = some;
		}
		printSubsets(a);
	}

}
