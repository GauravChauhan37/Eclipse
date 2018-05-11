package timenspacecomp;

public class sort01 {

	public static void main(String[] args) {
		int[] a = { 1, 0, 0, 1, 0, 1, 1, 1 };
		int i = 0, j = a.length - 1;
		while (i <= j) {
			if (a[i] == 0) {
				i++;
			} else if (a[j] == 1) {
				j--;
			} else {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}

}
