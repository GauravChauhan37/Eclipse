package practice;

import java.util.Scanner;

public class flipallbits {
	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int input = sc.nextInt();
		for (int i = input - 1; i >= 0; i--) {
			temp = temp + (1 << i);
		}
		System.out.println(Integer.toBinaryString(temp));
		int scndbit = 0;
		int bitmask = 1 << input - 1;
		System.out.println(Integer.toBinaryString(bitmask));
		bitmask = bitmask + scndbit;
		temp = temp & bitmask;

	}
}
