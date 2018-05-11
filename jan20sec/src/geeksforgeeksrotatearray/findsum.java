package geeksforgeeksrotatearray;

//findgivensuminsortedandrotatedarray
public class findsum {

	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int sum = 16;
		int n = arr.length;

		if (pairInSortedRotated(arr, n, sum))
			System.out.print("Array has two elements" + " with sum 16");
		else
			System.out.print("Array doesn't have two" + " elements with sum 16 ");
	}

	public static Boolean pairInSortedRotated(int[] a, int n, int sum) {
		// find pivot
		for (int i = 0; i < n-1; i++) {
			if (a[i] > a[i + 1]) {
				break;
			}
			int smallest = i + 1;
			int largest = i;
			while (smallest != largest) {
				if (a[smallest] + a[largest] == sum) {
					return true;
				} else if (a[smallest] + a[largest] > sum) {
					largest = (n - 1 + largest) % n;
				} else if (a[smallest] + a[largest] < sum) {
					smallest = (smallest + 1) % n;
				}
			}
		}
		return false;
	}
}
