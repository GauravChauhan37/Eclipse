package practice;

public class intersection {
	public static void printIntersection(int arr1[], int arr2[], int m, int n) {
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr1[i])
				j++;
			else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}
	}

	public static void main(String args[]) {
		int arr1[] = { 1, 2, 3, 1, 2, 4, 1 };
		int arr2[] = { 2, 1, 3, 1, 5, 2, 2 };
		int m = arr1.length;
		int n = arr2.length;
		printIntersection(arr1, arr2, m, n);
	}
}