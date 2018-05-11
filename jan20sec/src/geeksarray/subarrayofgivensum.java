package geeksarray;

public class subarrayofgivensum {
	public static void subArraySum(int arr[], int n, int sum) {
		int curr_sum = arr[0], start = 0, i;
		for (i = 1; i <= n; i++) {
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if (curr_sum == sum) {
				System.out.println("Sum found between indexes " + start + " and " + --i);
				return;
			}
			if (i < n)
				curr_sum = curr_sum + arr[i];
		}
		System.out.println("No subarray found");
	}

	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 26;

		subArraySum(arr, n, sum);
	}
}
