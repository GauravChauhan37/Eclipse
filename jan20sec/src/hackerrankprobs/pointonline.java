package hackerrankprobs;

import java.util.Scanner;

public class pointonline {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		boolean flag = false;
		if (n == 2) {
			if (x == x1 || y == y1) {
				System.out.println("YES");
				return;
			} else {
				System.out.println("NO");
				return;
			}
		}
		if (x == x1)
			flag = false;
		if (y == y1)
			flag = true;
		for (int i = 2; i < n; i++) {
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if (flag == false && x2 != x) {
				System.out.println("NO");
				return;
			} else if (flag == true && y2 != y) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
