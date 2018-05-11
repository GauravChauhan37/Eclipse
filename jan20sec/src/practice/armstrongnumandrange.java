package practice;

import java.util.Scanner;

public class armstrongnumandrange {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int start = a.nextInt();
		int end = a.nextInt();
		System.out.println(arm(n,end));
		range(start, end);
	}

	public static boolean arm(int n,int end) {
		int b, arm = 0;
		int temp = n;
		boolean ans;
		int c = end;
		int count = 0;
		while (c > 0) {
			c = c / 10;
			count++;
		}
		while (n > 0) {
			b = n % 10;
			arm=(int) (arm+Math.pow(b, count));
			n = n / 10;
		}

		if (temp == arm) {
			ans = true;
		} else {
			ans = false;
		}
		return ans;

	}

	public static void range(int start, int end) {
		int b;
		int c = end;
		int count = 0;
		while (c > 0) {
			c = c / 10;
			count++;
		}
		for (int i = 1; i <= end; i++) {
			int n = i;
			int some = 1;
			int arm = 0;
			while (n > 0) {
				b = n % 10;
				arm=(int) (arm+Math.pow(b, count));
				n = n / 10;
				
			}
			if (arm == i) {
				System.out.print(i + " ");
			}
			arm = 0;
		}

	}
}
