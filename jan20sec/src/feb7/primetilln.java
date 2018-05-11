package feb7;

import java.util.Scanner;

public class primetilln {

	public static void main(String[] args) {
		int i;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = a.nextInt();
		int num = 2;

		while (num <= n) {
			int thenumisnotprime = 0;
			for (i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					thenumisnotprime = 1;
					break;
				}
			}
			if (thenumisnotprime == 0) {
				System.out.println(num);

			}
			num++;
		}

	}
}
