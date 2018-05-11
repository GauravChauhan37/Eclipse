package jan20sec;

import java.util.Scanner;

public class printpositivenums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("enter count of Numbers you want to check");
		int n = a.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter a number");
			int b = a.nextInt();
			if (b > 0) {
				System.out.println("It is a positive value" + " " + b);
			} else {
				System.out.println("value is negative" + " " + b);
			}
		}

	}
}
