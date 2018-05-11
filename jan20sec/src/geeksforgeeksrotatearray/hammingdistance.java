package geeksforgeeksrotatearray;

import java.util.Scanner;

public class hammingdistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] temp = new int[a.length * 2];
		for (int i = 0; i < a.length; i++) {
			temp[i] = temp[i + a.length] = a[i];
		}
		System.out.println(hamm(a, temp));
	}

	public static int hamm(int[] a, int[] temp) {
		int count = 0; int maxcount =0 ;
		for (int i = 0; i < a.length; i++) {
			count=0;
			for (int j = i, k=0; j < i +a.length; j++, k++) {
				if (temp[j] != a[k])
					count++;
				if (count == a.length)
					return count;
			}
			if(count > maxcount)
				maxcount  =count;
		}
		return maxcount;
	}
}
