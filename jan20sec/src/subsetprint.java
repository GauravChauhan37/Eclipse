
public class subsetprint {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int start;
		int end;
		for (start = 0; start < a.length; start++) {
			for (end = start; end < a.length; end++) {
				for (int i = start; i <= end; i++) {
					System.out.print(a[i]+" ");
				}
				System.out.println();

			}

		}
	}

}
