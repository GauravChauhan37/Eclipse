package practice;

import java.util.Scanner;

public class rangeuntilsumandxoraresame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int bitmask = 0;
		for (int i = 0; i < n; i++) {
			// add
			int sum = n;
			sum = sum + i;
			// bitwise xor
			int temp = n ^ i;
			if (sum == temp) {
				count++;
				continue;
			} else {
				break;
			}
		}
		System.out.println(count);
	}

}
