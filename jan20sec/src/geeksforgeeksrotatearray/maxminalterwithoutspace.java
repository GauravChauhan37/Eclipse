package geeksforgeeksrotatearray;

public class maxminalterwithoutspace {
	// tc -->O(n2) , sc --> O(1)
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		alter(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int[] alter(int[] a) {
		int first = 0, last = a.length - 1;
		for (int i = 0; i < a.length - 1; i += 2) {
			int temp = a[i];
			a[i] = a[last];
			int j = last - 1;
			while (j > i) {
				a[j + 1] = a[j];
				j--;
			}
			a[i + 1] = temp;
		}
		return a;
	}
}
