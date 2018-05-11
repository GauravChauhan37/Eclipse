package hackerrankprobs;

import java.util.Scanner;

public class sumofdigitsofarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		long some = a[0];
		int count = 0;
		while (some != 0) {
			some = some / 10;
			count++;
		}
		sum(a, count);

	}

	public static void sum(long[] a, int count) {
		int pow = 10;
		long sum = 0;
		long total = 0;
		int counter = 0;
		while (counter != count) {
			for (int i = 0; i < a.length; i++) {
				sum = sum + ((a[i] % pow) % 10);
			}
			int carry = (int) (sum / 10);
			sum = sum % 10;
			total = total + sum;
			total *=10;    //handlecode here
			sum = carry;
			pow *= 10;
			counter++;
		}
		System.out.println(total/10);
	}
}
