package dp;

import java.util.ArrayList;

public class coinchange {
	public static void coinChange(int[] a, int target) {
		int[] count = new int[11];
		ArrayList[] path = new ArrayList[11];
		for (int i = 0; i < path.length; i++) {
			path[i] = new ArrayList<String>();
		}
		count[0] = 1;
		path[0].add("");
		for (int i = 0; i < a.length; i++) {
			for (int j = a[i]; j < count.length; j++) {
				int index = j - a[i];
				count[j] = count[j] + count[index];
				ArrayList<String> srcList = path[index];
				ArrayList<String> destList = path[j];
				for (String s : srcList) {
					destList.add(s + a[i]);
				}
			}
		}
		System.out.println(count[10]);
		System.out.println(path[10]);
	}

	public static void coinChangeperm(int[] a, int target) {
		int[] count = new int[11];
		ArrayList[] path = new ArrayList[11];
		for (int i = 0; i < path.length; i++) {
			path[i] = new ArrayList<String>();
		}
		path[0].add("");
		count[0] = 1;
		for (int j = 0; j < count.length; j++) {
			for (int i = 0; i < a.length; i++) {
				int index = j - a[i];
				if (index >= 0) {
					count[j] = count[j] + count[index];
					ArrayList<String> srcList = path[index];
					ArrayList<String> destList = path[j];
					for (String s : srcList) {
						destList.add(s + a[i]);
					}
				}
			}
		}
		System.out.println(count[10]);
		System.out.println(path[10]);
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 6 };
//		 coinChange(a, 10);
		coinChangeperm(a, 10);
	}

}
