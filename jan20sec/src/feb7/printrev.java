package feb7;

import java.util.Scanner;

public class printrev {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = a.nextInt();
		while (num != 0) {
			int b = num % 10;
			num = num / 10;
			System.out.print(b);

		}

	}
}
