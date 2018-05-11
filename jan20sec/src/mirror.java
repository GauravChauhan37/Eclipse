
public class mirror {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int temp;
		int first = 0;
		int last = a.length - 1;
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.print('\t');
		while (first < last) {
			temp = a[first];
			a[first] = a[last];
			a[last] = temp;
			first++;
			last--;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}

	}

}
