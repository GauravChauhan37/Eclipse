package geeksarray;

public class seggrzeroand1s {

	public static void letsdoit(int[] a) {
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
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 1, 0, 1, 1, 0 };
		letsdoit(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
