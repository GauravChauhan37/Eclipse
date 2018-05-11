package timenspacecomp;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_6findpairwithgivendiff {
	public static void findpairs(int[] a, int targetdiff) {
		Arrays.sort(a);
		boolean flag = false;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] + targetdiff == a[i + 1]) {
				System.out.println(a[i] + " " + a[i + 1]);
				flag = true;
			}
		}
		if(flag == false){
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int targetdiff = sc.nextInt();
		int[] a = new int[as];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		findpairs(a, targetdiff);
	}

}
