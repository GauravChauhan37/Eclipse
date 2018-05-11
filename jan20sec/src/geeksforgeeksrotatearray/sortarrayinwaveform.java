package geeksforgeeksrotatearray;

public class sortarrayinwaveform {

	public static void main(String[] args) {
		int[] a = { 10, 5, 6, 3, 2, 20, 100, 80 };
		wavesort(a);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static void wavesort(int[] a) {
		for (int i = 0; i < a.length; i +=2) {
			if (i>0 && a[i-1] > a[i] ) {
				int temp = a[i];
				a[i] = a[i - 1];
				a[i - 1] = temp;
			} else if  (i<a.length-1 && a[i] < a[i+1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
	}

}