package hackerrankprobs;

import java.util.Scanner;

public class kconcat {
	public static int kadane(int[] b) {
		int[] a = new int[b.length * 2];
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i % b.length];
		}
		int omax = a[0];
		int cmax = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] + cmax > a[i]) {
				cmax = a[i] + cmax;
			} else {
				cmax = a[i];
			}
			if (cmax > omax) {
				omax = cmax;
			}
		}
		return omax;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nooftest = sc.nextInt();
		while (nooftest != 0) {
			int as = sc.nextInt();
			long k = sc.nextLong();
			int[] a = new int[as];
			for (int i = 0; i < as; i++) {
				a[i] = sc.nextInt();
			}
			int ans = kadane(a);
			long sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}
			sum = sum * (k - 2);
			if (sum <= 0) {
				System.out.println(ans);
			}
			if (sum > 0) {
				System.out.println(ans + sum);
			}
			nooftest--;
		}
	}
}
