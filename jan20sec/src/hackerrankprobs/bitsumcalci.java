package hackerrankprobs;

import java.util.Scanner;

public class bitsumcalci {

	public static void main(String[] args) {
		char ch = ' ';
		int first = 0;
		int scnd = 0;
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while (flag) {
			ch = sc.next().charAt(0);
			int num = check(ch);
			first = sc.nextInt();
			scnd = sc.nextInt();
			if (ch == 'X' || ch == 'x') {
				return;
			}
			if (num == 6) {
				System.out.println("Invalid Operation");
				return;
			}
			operation(first, scnd, num, flag);
		}
	}

	public static void operation(int first, int scnd, int op, Boolean flag) {
		if (op == 1) {
			System.out.println(first + scnd);
		} else if (op == 2) {
			System.out.println(first - scnd);
		} else if (op == 3) {
			System.out.println(first * scnd);
		} else if (op == 4) {
			System.out.println(first / scnd);
		} else if (op == 5) {
			System.out.println(first % scnd);
		} else {
			System.out.println("Invalid Operation");
			flag = false;
		}
	}

	public static int check(char ch) {
		if (ch == '+') {
			return 1;
		} else if (ch == '-') {
			return 2;
		} else if (ch == '*') {
			return 3;
		} else if (ch == '/') {
			return 4;
		} else if (ch == '%') {
			return 5;
		} else {
			return 6;
		}
	}
}
