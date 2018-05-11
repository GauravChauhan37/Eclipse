package feb9;

import java.util.Scanner;

public class bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		byte b = sc.nextByte();
		for (int i = 7; i >= 0; i--) {
			byte bitmask = (byte) (1 << i);
			if ((b & bitmask) == 0) {
				System.out.print(0);
			} else {
				System.out.print(1);
			}

		}

	}
}