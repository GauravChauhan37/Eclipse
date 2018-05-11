package practice;

import java.util.Scanner;

public class xorofgivenrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int first = 1;
		int temp = 0;
		int second = 2;
		int result = first ^ second;
		for (int i = 3; i <= input; i++) {
			temp = result ^ i;
			result = temp;
		}
		System.out.println(temp);
	}

}
