package hackerrankprobs;

import java.util.Scanner;

public class rectangularsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long minrow = Integer.MAX_VALUE;
		long mincol = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			long first = sc.nextLong();
			long scnd = sc.nextLong();
			minrow = Math.min(minrow, first);
			mincol = Math.min(mincol, first);
		}
		System.out.println(minrow * mincol);
	}

}
