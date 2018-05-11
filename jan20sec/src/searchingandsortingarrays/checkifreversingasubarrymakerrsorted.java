package searchingandsortingarrays;

public class checkifreversingasubarrymakerrsorted {
	public static void checkIfSorted(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				index = i;
				break;
			}
		}
		int lastindex = 0;
		boolean flash = false;
		int j = 0;
		for (j = index; j < arr.length - 1; j++) {
			if (arr[j] < arr[j + 1]) {
				lastindex = j;
				flash = false;
				break;
			} else {
				flash = true;
			}
		}
		if (j == arr.length - 1 && flash == true) {
			lastindex = j;
		}
		while (index < lastindex) {
			int temp = arr[index];
			arr[index] = arr[lastindex];
			arr[lastindex] = temp;
			index++;
			lastindex--;
		}
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 4, 3,6 };
		checkIfSorted(a);
	}

}
