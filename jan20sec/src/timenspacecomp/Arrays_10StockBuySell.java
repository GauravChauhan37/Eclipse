package timenspacecomp;

import java.util.Scanner;

public class Arrays_10StockBuySell {
	public static void findMaxProfit(int[] a) {
		int i = 0, j = 1;
		int profit = 0;
		while (j < a.length) {
			if (a[i] < a[j]) {
				j++;
			} else if (i + 1 == j && a[i] > a[j]) {
				i = j;
				j = i + 1;
				profit = 0;
			} else {
				j--;
				System.out.println(i + " " + j);
				profit = profit + a[j] - a[i];
				i = j + 1;
				j = i + 1;
			}
		}
		j--;
		if (i + 1 <= j) {
			System.out.println(i + " " + j);
			profit = profit +a[j] - a[i];
		}
		System.out.println(profit);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int[] a = new int[as];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		findMaxProfit(a);
	}

}
