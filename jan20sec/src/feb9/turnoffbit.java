package feb9;

import java.util.Scanner;

public class turnoffbit {

	public static void main(String[] args) {
		//offbit
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		byte b = sc.nextByte();
		System.out.println("enter bit");
		byte bit = sc.nextByte();
		byte bitmask = (byte) (1 << bit);
		bitmask = (byte) (~bitmask);
		b = (byte) (b & bitmask);
		System.out.println(Integer.toBinaryString(b));

	}

}
