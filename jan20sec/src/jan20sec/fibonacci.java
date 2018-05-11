package jan20sec;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = a.nextInt();
		System.out.println("Enter second number");
		int Second = a.nextInt();
		System.out.println("Enter the count value");
		int count = a.nextInt();
		System.out.print(first +""+ Second);
		for (int i = 2; i <= count; i++) {
			int fi = first + Second;
			System.out.print(fi);
			first = Second;
			Second = fi;
		}

	}

}
