package jan20sec;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		for (i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of given number is" + " " + factorial);
	}

}
