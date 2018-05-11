package timenspacecomp;

import java.util.Scanner;

public class RaiseToPowerN {
	public static void findpower(int a, int b) {
		int pow = a;
		int sum = 0;
		for (int i = 0; i * i < b; i++) {
			sum = a * pow;
			pow = pow * a;
			sum = pow * sum;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		while (not != 0) {
			int no = sc.nextInt();
			int no2 = sc.nextInt();
			findpower(no, no2);
			System.out.println();
			not--;
		}
	}

}
