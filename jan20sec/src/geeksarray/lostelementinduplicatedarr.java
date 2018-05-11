package geeksarray;

public class lostelementinduplicatedarr {
	public static void findelementsorted(int[] first, int[] scnd) {
		int low = 0;
		int high = first.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (first[mid] <= scnd[mid]) {
				high = mid;

			} else {
				low = mid;
			}
			if (low == high - 1) {
				System.out.println(first[high]);
			}
		}
	}

	public static void findelementunsorted(int[] first, int[] scnd) {
		int res = 0;
		for (int i = 0; i < first.length; i++) {
			res = res ^ first[i];
		}
		for (int i = 0; i < scnd.length; i++) {
			res = res ^ scnd[i];
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		int[] first = { 2, 1, 3, 4, 5, 7, 9 };
		int[] scnd = { 1, 2, 4, 5, 7, 9 };
		// findelementsorted(first, scnd); // bs soln is not working for all
		// inputs //
		findelementunsorted(first, scnd); // when unsorted arr are given
	}

}
