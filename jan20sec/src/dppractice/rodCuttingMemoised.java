package dppractice;

public class rodCuttingMemoised {
	static int counter = 0;

	public static int findPrice(int[] arr, int rodLength, int[] qb) {
		if (rodLength == 0) {
			return 0;
		}
		if (qb[rodLength] != 0) {
			return qb[rodLength];
		}
		int msp = arr[rodLength];
		int left = 0;
		int right = rodLength - 1;
		while (left < right) {
			int mspl = findPrice(arr, left, qb);
			int mspr = findPrice(arr, right, qb);
			if (mspl + mspr > msp) {
				msp = mspl + mspr;
			}
			left++;
			right--;
		}
		System.out.println(++counter);
		qb[rodLength] = msp;
		return msp;
	}

	public static void main(String[] args) {
		int[] a = { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
		int price = findPrice(a, 8, new int[a.length]);
		System.out.println(price);
	}
}
