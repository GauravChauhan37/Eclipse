package geeksarray;

import java.util.Arrays;

// distinct elemenst allowed
// targetTC = O(nsq)
public class largestsubarraywithcontigiouselements {
	public static void findSubArr(int[] a) {
		int count = 1;
		int ocount = Integer.MIN_VALUE;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] + 1 == a[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count > ocount) {
				ocount = count;
			}
		}

		System.out.println(ocount);
	}

	public static void main(String[] args) {
		int[] a = { 1, 56, 57, 58, 90, 92, 93, 94, 91, 45 };
		Arrays.sort(a);
		findSubArr(a);
	}

}
