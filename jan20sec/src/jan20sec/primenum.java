package jan20sec;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		int flag = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		int b = a.nextInt();
		for (int i = 2; i * i <= b; i++) {
			if (b % i == 0)
			{
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			System.out.println("given number" + b + "is not prime");
		} else {
			System.out.println("given number" + b + "is prime");
		}
	}
}
