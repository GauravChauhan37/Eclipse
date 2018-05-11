package searchingandsortingarrays;

public class maxsumofunadjacentelements {
	public static int FindMaxSum(int arr[], int n) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < n; i++) {
			if (incl > excl)
				excl_new = incl;
			else
				excl_new = excl;
			
			incl = excl + arr[i];
			excl = excl_new;
		}

		return ((incl > excl) ? incl : excl);
	}

	public static void main(String[] args) {
		int[] a = { 2,10,20,10,1,20};
		System.out.println(FindMaxSum(a, a.length));
	}

}
