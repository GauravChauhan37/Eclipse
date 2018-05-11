package geeksforgeeksrotatearray;

import java.util.Scanner;

public class lexographicalorderstring {
	// not working
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		smallestsequence(s);
	}

	public static void smallestsequence(String s) {
		char[] a = s.toCharArray();
		int startingindex = find(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[(startingindex + i) % a.length]);
		}
	}

	public static int find(char[] a) {
		int index = 0;
		for (int i = 1; i < a.length; i++) {
			if (smallestseq(a, index, i, a.length))
				index = i;
		}
		return index;
	}

	public static Boolean smallestseq(char[] a, int x, int y, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[x] < a[y])
				return false;
			else if (a[x] > a[y])
				return true;
			x = (x + 1) % n;
			y = (y + 1) % n;
		}
		return true;
	}
}
