package geeksarray;

public class convertarryinzigzag {
	public static void zigZag(int[] arr) {
		int i = 0;
		boolean flag = false;
		while (i < arr.length-1) {
			if (arr[i] > arr[i + 1] && flag == false) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i++;
			} else if (arr[i] < arr[i + 1] && flag == true) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i++;
			} else {
				i++;
			}
			flag = !flag;
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 12, 14, 18, 2, 7 };
		zigZag(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
