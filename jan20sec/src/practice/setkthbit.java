package practice;

import java.util.Scanner;

public class setkthbit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(Integer.toBinaryString(num));
		int bitmask = 1 << k;
		num = num | bitmask;
		System.out.println(num + " " + Integer.toBinaryString(num));
	}
}