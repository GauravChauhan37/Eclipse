package geeksarray;

public class makearrpalindrome {
	// Find minimum number of merge operations to make an array palindrom
	public static void countsteps(int[] a) {
		int start = 0;
		int last = a.length - 1;
		int steps = 0;
		while (start < last) {
			if (a[start] == a[last]) {
				start++;
				last--;
			} else if (a[start] < a[last]) {
				a[start + 1] = a[start + 1] + a[start];
				start++;
				steps++;
			} else if (a[start] > a[last]) {
				a[last - 1] = a[last - 1] + a[last];
				last--;
				steps++;
			}
		}
		System.out.println(steps);

	}

	public static void main(String[] args) {
		int[] a = { 11, 14, 15, 99 };
		countsteps(a);
	}

}
