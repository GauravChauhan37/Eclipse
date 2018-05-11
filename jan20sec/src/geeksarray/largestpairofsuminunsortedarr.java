package geeksarray;

public class largestpairofsuminunsortedarr {

	public static void findLargSum(int[] a) {
		int first = a[0];
		int scnd = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > first) {
				scnd = first;
				first = a[i];
			} else if (a[i] > scnd && a[i] != first) {
				scnd = a[i];
			}
		}
		System.out.println(first + scnd);
	}

	public static void main(String[] args) {
		int[] a = { 12, 34, 10, 6, 40 };
		findLargSum(a);
	}

}
