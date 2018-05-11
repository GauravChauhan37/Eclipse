package timenspacecomp;

public class findrepeatedone {
	public static int find(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp = temp ^ a[i] ^ i;
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] a = { 5, 2, 3, 1, 4, 3 };
		System.out.println(find(a));
	}

}
