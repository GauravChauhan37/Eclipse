package searchingandsortingarrays;

public class mergetwosortedarr {

	public static void mergeArr(int[] arr1, int[] arr2) {
		int lastElement = 0;
		int j = 0;
		for (int i = arr2.length - 1; i >= 0; i--) {
			lastElement = arr1[arr1.length - 1];
			for (j = arr1.length - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
				arr1[j + 1] = arr1[j];
			}
			if (lastElement > arr2[i]) {
				arr1[j + 1] = arr2[i];
				arr2[i] = lastElement;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 9, 10, 15, 20 };
		int[] arr2 = { 2, 3, 8, 13 };
		mergeArr(arr1, arr2);
		for (Integer i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (Integer j : arr2) {
			System.out.print(j + " ");
		}
	}

}
