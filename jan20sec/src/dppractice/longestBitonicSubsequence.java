package dppractice;

public class longestBitonicSubsequence {
	public static void longestBitSub(int[] arr) {
		int[] incsub = new int[arr.length];
		int[] decsub = new int[arr.length];
		int maxSub = Integer.MIN_VALUE;
		incsub[0] = 1;
		for (int i = 1; i < incsub.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					if (incsub[i] < incsub[j]) {
						incsub[i] = incsub[j];
					}
				}
			}
			incsub[i]++;
		}
		for (int i = decsub.length - 1; i >= 0; i--) {
			for (int j = decsub.length - 1; j > i; j--) {
				if (arr[j] < arr[i]) {
					if (decsub[i] < decsub[j])
						decsub[i] = decsub[j];
				}
			}
			decsub[i]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (incsub[i] + decsub[i] > maxSub)
				maxSub = incsub[i] + decsub[i];
		}
		System.out.println(maxSub);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 };
		longestBitSub(arr);
	}

}
