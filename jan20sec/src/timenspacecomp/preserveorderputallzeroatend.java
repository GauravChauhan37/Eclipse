package timenspacecomp;

public class preserveorderputallzeroatend {

	public static void main(String[] args) {
		int[] a = { 5, 0, 6, 0, 7, 0, 0, 8, 0, 9 };
		int i = 0;
		int j = 0;
		while (i < a.length) {
			if (a[i] == 0) {
				i++;
			} else {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j++;
			}
		}
		for (int val : a) {
			System.out.print(val + " ");
		}
	}

}
