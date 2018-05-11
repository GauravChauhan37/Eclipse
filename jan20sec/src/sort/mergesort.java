package sort;

public class mergesort {

	public static void main(String[] args) {
		int[] a = { 12, 321, 3213, 4, 25, 12, 5, 436, 457, 1, 3432, 5, 435 };
		int start = 0;
		int end = a.length - 1;
		sort(a, start, end);
	}

	public static void sort(int[] a, int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;
		sort(a, start, mid);
		sort(a, mid + 1, end);
		mergesort(a, start, mid, end);
	}

	public static void mergesort(int[] a, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int counter = 0;
		int left = start;
		int right = mid + 1;
		while (left <= mid && right <= end) {
			if (a[left] <= a[right]) {
				temp[counter] = a[left];
				left++;
				counter++;
			} else {
				if (a[left] > a[right]) {
					temp[counter] = a[right];
					counter++;
					right++;
				}
			}
		}
		if (left <= mid) {
			while (left <= mid) {
				temp[counter] = a[left];
				left++;
				counter++;
			}
		} else if (right <= end) {
			while (right <= end) {
				temp[counter] = a[right];
				right++;
				counter++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
	}
}
