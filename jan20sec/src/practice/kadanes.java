package practice;

import java.util.Scanner;

public class kadanes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		while (p != 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				int some = sc.nextInt();
				a[i] = some;
			}
			kadane(a);
        p--;
		}

	}

	public static void kadane(int[] a) {
		int cmax = a[0];
		int cep = 0, csp = 0;
		int omax = a[0];
		int oep = 0, osp = 0;
		for (int i = 1; i <= a.length - 1; i++) {
			if (a[i] + cmax > a[i]) {
				cmax = a[i] + cmax;
				cep = i;
			} else {
				cmax = a[i];
				csp = i;
				cep = i;
			}

			if (cmax > omax) {
				omax = cmax;
				osp = csp;
				oep = cep;

			}
		}
		System.out.println(omax + " " + osp + " " + oep);
	}
}
