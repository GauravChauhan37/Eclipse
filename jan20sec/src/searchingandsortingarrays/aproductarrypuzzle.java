package searchingandsortingarrays;

public class aproductarrypuzzle {
	// Given an array arr[] of n integers, construct a Product Array prod[] (of
	// same size) such that prod[i] is equal to the product of all the elements
	// of arr[] except arr[i]. Solve it without division operator and in O(n).

	public static void productArray(int arr[]) {
		int i, temp = 1;
		int prod[] = new int[arr.length];

		for (int j = 0; j < prod.length; j++)
			prod[j] = 1;

		for (i = 0; i < prod.length; i++) {
			prod[i] = temp;
			temp *= arr[i];
		}

		temp = 1;

		for (i = prod.length - 1; i >= 0; i--) {
			prod[i] *= temp;
			temp *= arr[i];
		}
		for (i = 0; i < arr.length; i++)
			System.out.print(prod[i] + " ");

		return;
	}

	public static void main(String[] args) {
		aproductarrypuzzle pa = new aproductarrypuzzle();
		int arr[] = { 10, 3, 5, 6, 2 };
		System.out.println("The product array is : ");
		pa.productArray(arr);
	}
}
