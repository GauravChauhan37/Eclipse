package feb8;

import java.util.Scanner;

public class b2dnd2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source num");
		int srcnum = sc.nextInt();
		System.out.println("Enter sourcebase");
		int srcbase = sc.nextInt();
		System.out.println("Enter destnbase");
		int db = sc.nextInt();
		int rem = 0, power = 1;
		int result = 0;
		while (srcnum != 0) {
			rem = srcnum % db;
			srcnum = srcnum / db;
			result = result + rem * power;
			power = power * srcbase;
		}
		System.out.println(result);
	}

}
