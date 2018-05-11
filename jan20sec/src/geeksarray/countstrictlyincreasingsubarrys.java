package geeksarray;

import java.util.ArrayList;

public class countstrictlyincreasingsubarrys {
	// count --> // tc --> O(m)
	// counteff --> // tc --> O(n)
	static ArrayList<String> al = new ArrayList<String>();

	public static void count(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j - 1] < a[j]) {
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
		System.out.println(al);
	}

	public static void counteff(int[] a) {
		int len = 1;
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] > a[i]) {
				len++;
			} else {
				count = count + (((len - 1) * len) / 2);
				len = 1;
			}
		}
		if (len > 1) {
			count = count + (((len - 1) * len) / 2);
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 8, 4 ,5};
		countstrictlyincreasingsubarrys c = new countstrictlyincreasingsubarrys();
		// c.count(a);
		c.counteff(a);
	}

}
