package timenspacecomp;

public class oddandsingle {
	public static int find(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp = temp ^ a[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] a = { 55, 8, 6, 55, 3, 6, 8 };
		int ans = find(a);
		System.out.println(ans);
	}

}
