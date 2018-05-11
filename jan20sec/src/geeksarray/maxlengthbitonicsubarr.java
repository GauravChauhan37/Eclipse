package geeksarray;

public class maxlengthbitonicsubarr {
	public static void bitLen(int[] a) {
		int[] inc = new int[a.length];
		int[] dec = new int[a.length];
		inc[0] = 1;
		dec[a.length - 1] = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] >= a[i - 1]) {
				inc[i] = inc[i - 1] + 1;
			} else {
				inc[i] = 1;
			}
		}
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] >= a[i + 1]) {
				dec[i] = dec[i + 1] + 1;
			} else {
				dec[i] = 1;
			}
		}
		int max = inc[0] + dec[0] - 1;
		for (int i = 1; i < a.length; i++) {
			if (inc[i] + dec[i] - 1 > max) {
				max = inc[i] + dec[i] - 1;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] a = { 12, 4, 78, 90, 45, 23 };
		bitLen(a);
	}

}
