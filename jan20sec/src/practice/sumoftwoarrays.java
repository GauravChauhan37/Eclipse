package practice;

import java.io.*;
import java.util.*;

public class sumoftwoarrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int some = sc.nextInt();
			a[i] = some;
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			int some = sc.nextInt();
			b[i] = some;
		}
		check(a, b);
	}

	public static void check(int[] a, int[] b) {
		int n = a.length - 1;
		int m = b.length - 1;
		if (a.length >= b.length) {
			sum(a, b, n, m);
		} else if (b.length > a.length) {
			sum(b, a, m, n);
		}
	}

	public static void sum(int[] a, int[] b, int n, int m) {
		int[] sum = new int[n + 2];
		int carry = 0;
		int s = 0;
		int i = n;
		int j = m;
		int k = n;
		while (j >= 0) {
			s = a[i] + b[j] + carry;
			sum[k] = s % 10;
			carry = s / 10;
			i--;
			j--;
			k--;
		}
		while (i >= 0) {
			s = a[i] + carry;
			sum[k] = s % 10;
			carry = s / 10;
			i--;
			k--;
		} k++;
		if (carry == 1) {
			sum[k] = sum[k] + 1;
			for (int p = 0; p < sum.length; p++) {
				System.out.print(sum[p] + " ");
			}
		}
		else{
			for (int p = 0; p < sum.length-1; p++) {
				System.out.print(sum[p] + " ");
			}
		}
	

	}
}