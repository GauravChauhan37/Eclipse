package jan20sec;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int b, arm = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = a.nextInt();
		while (n > 0) {
			b = n % 10;
			n = n / 10;
			arm = arm + (b * b * b);
		}
		int temp = n;
		if (temp == arm) {
			System.out.println("Given number is armstrong");
		} else
			System.out.println("Given number is not armstrong");
	}

}
