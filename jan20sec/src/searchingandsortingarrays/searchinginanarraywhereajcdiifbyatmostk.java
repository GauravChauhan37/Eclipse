package searchingandsortingarrays;

public class searchinginanarraywhereajcdiifbyatmostk {
	public static void elementIs(int[] a, int x, int k) {
		if (a[0] - a[1] == k && a[0] == x) {
			System.out.println(a[0]);
		}
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] == x) {
				if (a[i] - a[i + 1] == k && a[i - 1] - a[i] == k) {
					System.out.println(a[i]);
				}
			}
		}
		if (Math.abs(a[a.length - 1] - a[a.length - 2]) == k && a[a.length - 1] == x) {
			System.out.println(a[a.length - 1]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 7, 7, 6 };
		int x = 6;
		int k = 1;
		int n = arr.length;
		elementIs(arr, x, k);
	}

}
