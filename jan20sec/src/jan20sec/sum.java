package jan20sec;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int su = 0;
		int counter = 1;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = t.nextInt();
		while (counter <= n) {
			counter++;
			su = su + counter;
		}
		System.out.println("Sum is " + su);

	}

}
