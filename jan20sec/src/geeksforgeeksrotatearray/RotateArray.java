package geeksforgeeksrotatearray;

public class RotateArray {

	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.leftRotate(arr, 2, 7);
		rotate.printArray(arr, 7);
	}

	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}
	
	void leftRotate(int[] a, int d, int l) {
		int temp;
		int i=0;
			temp = a[i];
			int j = i;
			int k = 0;
			while (true) {
				k = k + d;
				if (k >= l) {
					k = k - l;
				}
				if (k == i) {
					break;
				}
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;
		}
//	void rightRotate(int[] a, int d, int l) {
//		int temp;
//		int i=l-1;
//			temp = a[i];
//			int j = i;
//			int k = 0;
//			while (true) {
//				k = k - d;
//				if (k <= 0) {
//					k = k +l;
//				}
//				if (k == i) {
//					break;
//				}
//				a[j] = a[k];
//				j = k;
//			}
//			a[j] = temp;
//		}
	}

