package feb9;

import java.util.Scanner;

public class patternchecking {

	public static void main(String[] args) {
		int i;
		boolean goingup;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter count");
		int count = sc.nextInt();
		System.out.println("enter prev");
		int prev = sc.nextInt();
		System.out.println("enter current");
		int current = sc.nextInt();
		if (prev < current) {
			goingup = true;
		} else {
			goingup = false;
		}
		for (i = 3; i <= count; i++) {
			if (goingup == true) {
				if (prev > current) {
					System.out.println("invalid");
					break;
				} else if (current < prev) {
					goingup = false;
				}
			} else if (goingup == false) {
				if (current > prev) {
					goingup = true;
				}
			}
			prev = current;
			current = sc.nextInt();
		}
	}
}
