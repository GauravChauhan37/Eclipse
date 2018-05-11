package recursion;

import java.util.Scanner;

public class oddandeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Isevenandodd(n);
	}

	public static void Isevenandodd(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		Isevenandodd(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
}
