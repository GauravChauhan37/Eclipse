package practice;

import java.util.Scanner;

public class rev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int some = sc.nextInt();
			a[i] = some;
		}
		invarr(a);
	}

	public static void invarr(int[] a) {
		int[] invar = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			invar[a[i]] = i;

		}
		for (int i = 0; i < invar.length; i++) {
			System.out.print(invar[i]+" ");
		}
		System.out.println();
		mirrorinverse(a,invar);
	}

	public static void mirrorinverse(int[] a, int[] invar) {
		for (int i = 0; i < a.length; i++) {
			if (a[a[i]] != i) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}
}
