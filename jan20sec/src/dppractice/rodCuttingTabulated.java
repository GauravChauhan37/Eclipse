
package dppractice;

public class rodCuttingTabulated {
	public static int findPrice(int[] arr, int rodLengt) {
		int[] cost = new int[rodLengt + 1];
		cost[0] = 0;
		cost[1] = arr[1];
		for (int i = 2; i < arr.length; i++) {
			int left = 0;
			int right = i - 1;
			int max = arr[i];
			while (left < right) {
				if (arr[left] + arr[right] > max) {
					max = arr[left] + arr[right];
				}
				left++;
				right--;
			}
			cost[i] = max;
		}
		return cost[rodLengt];
	}

	public static void main(String[] args) {
		int[] a = { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
		int price = findPrice(a, 8);
		System.out.println(price);
	}

}
