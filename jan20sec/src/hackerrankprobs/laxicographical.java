package hackerrankprobs;

import java.util.Scanner;

public class laxicographical {
	public static void print(int range, int start) {
		if (start >= range) {
			return;
		}
		System.out.println(start);
		for (int i = 0; i < 10; i++) {
			if (start * 10 + i < range) {
				int other = start * 10 + i;
				print(range, other);
			}
		}
		if (start < 9) {
			start++;
			print(range, start);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		print(range, 1);
		sc.close();
	}

}
