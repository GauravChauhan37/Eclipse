package geeksarray;

public class findpeakelements {
	public static int peakbs(int[] a, int low, int high) {
		if (high <= low) {
			return -1;
		}
		int mid = low + (low + high) / 2;
		if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) {
			return a[mid];
		} else if (a[mid] < a[mid - 1] && mid > 0) {
			return peakbs(a, low, mid - 1);
		} else {
			return peakbs(a, mid + 1, high);
		}
	}

	public static void peak(int[] a) {
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 15, 2, 23, 90, 66 };
		// peak(a);
		System.out.println(peakbs(a, 0, a.length - 1));
	}

}
