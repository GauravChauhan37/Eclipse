package fenwickTree;

public class client {

	public static void main(String[] args) {
		int[] arr = { 2, 0, -1, 3, 8, -4, -2, 3 };
		FenwickTree f = new FenwickTree(arr);
		System.out.println(f.query(2, 5));

	}

}
