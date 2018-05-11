package geeksarray;

import java.util.Scanner;

public class floorandceilinginsortedarray {
	public static int findceil(int[] a, int n) {
		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (a[mid] >= n && a[mid + 1] > n) {
				return a[mid];
			} else if (a[mid] < n) {
				high = mid - 1;
			} else if (a[mid] > n) {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static int findfloor(int[] a, int n) {
		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (a[mid] == n) {
				return a[mid];
			}
			if (a[mid - 1] <= n && n < a[mid]) {
				return a[mid - 1];
			}
			if (a[mid] > n) {
				high = mid - 1;
			} else if (n < a[mid]) {
				low = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 8, 10, 10, 12, 19 };
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
