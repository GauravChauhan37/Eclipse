package geeksarray;

public class minsteptogettodesiredarr {
	static int arr[] = new int[] { 2,3,4 };

	static int countMinOperations(int n) {
		int result = 0;

		while (true) {
			int zero_count = 0;

			int i; // To find first odd element
			for (i = 0; i < n; i++) {
				if (arr[i] % 2 == 1)
					break;

				else if (arr[i] == 0)
					zero_count++;
			}

			if (zero_count == n)
				return result;

			if (i == n) {
				for (int j = 0; j < n; j++)
					arr[j] = arr[j] / 2;
				result++;
			}

			for (int j = i; j < n; j++) {
				if (arr[j] % 2 == 1) {
					arr[j]--;
					result++;
				}
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Minimum number of steps required to \n" + "get the given target array is "
				+ countMinOperations(arr.length));

	}
}
