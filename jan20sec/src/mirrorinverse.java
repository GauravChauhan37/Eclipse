
public class mirrorinverse {

	public static void main(String[] args) {
		int[] a = { 3, 1, 4, 0, 2 };
		for (int i = 0; i < a.length; i++) {
			if (a[a[i]] != i) {
				System.out.println("false");
				return;
			} else {
				continue;
			}
		}
		System.out.println("true");
	}
}
