package recursion;

public class binarysearch {
	public static void main(String[] args) {
		int[] a = { 2, 4, 9, 15, 212, 1024 };
		int key = 9;
		int low = 0, high = a.length - 1;
		System.out.println(bs(a, low, high, key));
	}

	public static int bs(int[] a, int low, int high, int data) {
		if (high >= low) {
			int mid =low+( high - low )/ 2;
			// mid = high + low / 2 goes outofbound in some cases
			if (a[mid] < data) {
				return bs(a, mid + 1, high, data);    
			// can also be written as int something = bs(a, mid + 1, high, data);  
				// return p
			} else if (a[mid] > data) {
				return bs(a, low, mid - 1, data);
			} else if (a[mid] == data) {
				return mid;
			}
		}
		return -1;
	}
}