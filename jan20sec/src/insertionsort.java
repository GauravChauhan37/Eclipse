
public class insertionsort {

	public static void main(String[] args) {
		int[] a = { 1, 3, 7, 4, 6, 8, 2, 5, 9 };
		int start = a[0];
		for (int i = 1; i < a.length; i++) {
			int temp;
			temp = a[i];
			if (temp > start) {
				continue;
			} else {
				a[i] = start;
				start = temp;
			}
			start++;
		}
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
