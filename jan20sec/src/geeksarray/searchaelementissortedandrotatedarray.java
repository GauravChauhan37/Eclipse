package geeksarray;

public class searchaelementissortedandrotatedarray {
	public static void findElement(int[] arr, int key, int low, int high) {
		if (low >= high) {
			System.out.println(-1);
			return;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == key) {
			System.out.println("element is " + arr[mid] + " " + "index is " + mid);
			return;
		}
		if (arr[mid] >= arr[low]) {
			if (key <= arr[low] && key >= arr[mid]) {
				findElement(arr, key, low, mid - 1);
			}
			findElement(arr, key, mid + 1, high);
		} else {
			if (key >= arr[mid] && key <= arr[high]) {
				findElement(arr, key, mid + 1, high);
			}
			findElement(arr, key, low, mid - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2 };
		findElement(arr, 1, 0, arr.length - 1);
	}

}
