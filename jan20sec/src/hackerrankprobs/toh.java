package hackerrankprobs;

import java.util.Scanner;

public class toh {
	static int count = 0;

	public static int toc(char s, char d, char h, int disk) {
		if (disk == 0)
			return count;

		toc(s, h, d, disk - 1);
		++count;
		toc(h, d, s, disk - 1);
		return count;
	}

	public static void toh(char s, char d, char h, int disk) {
		if (disk == 0)
			return;

		toh(s, h, d, disk - 1);
		System.out.println("Move disk" + "[" + disk + "]" + " " + "from" + " " + s + " " + "to" + " " + d);
		toh(h, d, s, disk - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(toc('A', 'B', 'C', n));
		toh('A', 'B', 'C', n);
	}

}
