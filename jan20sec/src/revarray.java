
public class revarray {

	public static void main(String[] args) {
		int[] a = { 55, 92, 35, 17, 11, 48 };
		int temp;
		int first = 0;
		int last = a.length - 1;
		while (first < last) {
			temp = a[first];
			a[first] = a[last];
			a[last] = temp;
			first++;
			last--;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
