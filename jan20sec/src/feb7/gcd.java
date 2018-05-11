package feb7;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		int rem = 1;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the dividend");
		int div = a.nextInt();
		System.out.println("Enter the divisor");
		int dis = a.nextInt();

		while (rem != 0) {
			rem = div % dis;
			if(rem==0) break;
			div = dis;
			dis = rem;
		}
		System.out.println("gcd is" +" " + dis);

	}

}
