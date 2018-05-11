package practice;

import java.util.Scanner;

public class checkingnumaspowerof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		while (num!=1) {
			if (num % 2 == 0) {
				flag = 1;
				num = num / 2;
			} else {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("true");
		} else if (flag == 0) {
			System.out.println("false");
		}
	}
}
