package geeksarray;

import java.util.Scanner;

public class flooransceilinginunsortedarray {
	public static int findceil(int[] a, int n) {
		int minsum = Integer.MAX_VALUE;
		int minisumi = 0;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				return a[i];
			}
			int min = Integer.MAX_VALUE;
			int mini = 0;
			min = n - a[i];
			mini = i;
			if (min < minsum && min > 0) {
				minsum = min;
				minisumi = mini;
			}
		}

		return a[minisumi];
	}

	public static int findfloor(int[] a, int n) {
		int maxsum = Integer.MAX_VALUE;
		int maxsumi = 0;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				return a[i];
			}
			int max = Integer.MIN_VALUE;
			int maxi = 0;
			max = a[i] - n;
			maxi = i;
			if (max < maxsum && a[maxi] > n) {
				maxsum = max;
				maxsumi = maxi;
			}
		}
		return a[maxsumi];
	}

	public static void main(String[] args) {
		int[] a = { 1, 8, 10, 2, 10, 19, 12 };
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		while (not != 0) {
			int n = sc.nextInt();
			System.out.println("ceil is" + " " + findceil(a, n));
			System.out.println("floor is" + " " + findfloor(a, n));
			not--;
		}
	}

}
