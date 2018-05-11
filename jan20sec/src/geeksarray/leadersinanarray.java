package geeksarray;

public class leadersinanarray {
	public static void leads(int[] a) {
		int max = a[a.length - 1];
		System.out.println(max);
		for (int i = a.length - 2; i >= 0; i--) {
			if (max < a[i]) {
				max = a[i];
				System.out.println(max);
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 16, 17, 4, 3, 5, 2 };
		leads(a);
	}

}
