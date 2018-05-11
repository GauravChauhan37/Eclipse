package geeksforgeeksrotatearray;

public class rotationcountinarray {
	// Find the Rotation Count in Rotated Sorted array
	// Consider an array of distinct numbers sorted in increasing order.
	// The array has been rotated (anti-clockwise) k number of times.
	// Given such an array, find the value of k.
	public static void main(String[] args) {
		// T.C --> O(n)
		// int[] a = {3, 4, 5, 1, 2};
		// int pivot = searchinrotatedarry.findpivot(a);
		// System.out.println(pivot);
		int[] a = {3, 4, 5, 1, 2};
		System.out.println(countRotations(a, 0, a.length - 1));
	}

	public static int countRotations(int[] arr, int low, int high) {
		//basecase 
		if (high < low)
	            return 0;
	        if (high == low)
	            return low;
	        int mid = low + (high - low)/2; 
	
	        // Check if element (mid+1) is minimum
	        // element. Consider the cases like
	        // {3, 4, 5, 1, 2}
	        if (mid < high && arr[mid+1] < arr[mid])
	            return (mid + 1);
	 
	        // Check if mid itself is minimum element
	        if (mid > low && arr[mid] < arr[mid - 1])
	            return mid;
	 
	        // Decide whether we need to go to left 
	        // half or right half
	        if (arr[high] > arr[mid]){
	            return countRotations(arr, low, mid - 1);
	        }
	        return countRotations(arr, mid + 1, high);
	    }
	}

