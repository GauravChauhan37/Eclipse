package dp;

public class longincsubsequences {
	public static void findLong(int[] arr) {
		int[] count = new int[arr.length];
		String[] path = new String[arr.length];
		count[0] = 1;
		path[0] = arr[0] + " ";
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					if (count[j] > count[i]) {
						count[i] = count[j];
						path[i] = path[j] + " ";
					}
				}
			}
			count[i]++;
			path[i] += arr[i] + " ";
		}
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(path[index]);
	}

	public static void main(String[] args) {
		int[] a = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 11, 12, 13, 14, 15, 16, 17 };
		findLong(a);
	}

}
