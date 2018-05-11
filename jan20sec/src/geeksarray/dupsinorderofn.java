package geeksarray;

public class dupsinorderofn {
	public static void printRepeating(int arr[], int size) {
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}

	public static void main(String[] args) {
		dupsinorderofn duplicate = new dupsinorderofn();
		int arr[] = { 2, 3, 2, 1, 4, 1 };
		int arr_size = arr.length;

		duplicate.printRepeating(arr, arr_size);
	}
}