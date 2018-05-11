package practice;

import java.util.Arrays;
import java.util.Scanner;

public class targetsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int some = sc.nextInt();
			a[i] = some;
		}
		Arrays.sort(a);
		int target = sc.nextInt();
		int m = a.length - 1;
		for (int i = 0; i <=target; i++) {
			for (int j = i + 1; j <= m; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(a[i] + "and" + a[j]);
					a[i] = a[j];
					a[j] = a[m ];
					m --;
				}
			}
		}
	}
}