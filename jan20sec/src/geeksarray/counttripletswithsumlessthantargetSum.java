package geeksarray;

import java.util.Arrays;

public class counttripletswithsumlessthantargetSum {
	// target TC = O(nsq)
	public static void findSum(int[] arr, int targetSum) {
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] < targetSum) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 1, 3, 4, 7 };
		int targetSum = 12;
		Arrays.sort(a);
		findSum(a, targetSum);
	}
}
