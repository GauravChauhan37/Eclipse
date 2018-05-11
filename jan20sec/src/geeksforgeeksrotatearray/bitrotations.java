package geeksforgeeksrotatearray;

import java.util.Scanner;

//left
// https://www.geeksforgeeks.org/check-two-numbers-bit-rotations-not/
//   122    and       2147483678     -- >   true 
public class bitrotations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(checkrotation(a, b));

	}

	public static Boolean checkrotation(long a, long b) {
		long c = b;
		for (int i = 0; i < 64; i++) {
			c = c << 1;
			if ( a == c) {
				return true;
			}
		}
		return false;
	}
}
