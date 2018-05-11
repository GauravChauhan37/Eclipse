package searchingandsortingarrays;

public class countinversions {
	public static int mergeSort(int[] a, int low, int high, int[] temp) {
		if (high <= low) {
			return 0;
		}
		int invcount = 0;
		int mid = (low + high) / 2;
		invcount += mergeSort(a, low, mid, temp);
		invcount += mergeSort(a, mid + 1, high, temp);
		invcount += merge(a, low, mid + 1, high, temp);
		return invcount;
	}

	public static int merge(int[] a, int low, int mid, int high, int[] temp) {
		int invcount = 0;
		int i, j, k;
		i = low;
		j = mid;
		k = low;
		while (i < mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k] = a[i];
				k++;
				i++;
			} else {
				temp[k] = a[j];
				k++;
				j++;
				invcount += (mid - i);
			}
		}
		if (i < mid) {
			while (i < mid) {
				temp[k] = a[i];
				k++;
				i++;
			}
		}
		if (j <= high) {
			while (j <= high) {
				temp[k] = a[j];
				k++;
				j++;
			}
		}
		for (int q = low; q <= high; q++) {
			a[q] = temp[q];
		}
		return invcount;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 1, 3, 5 };
		int[] temp = new int[a.length];
		System.out.println(mergeSort(a, 0, a.length - 1, temp));
	}

}
