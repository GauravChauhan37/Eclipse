
public class exponentialsearch {

	public static void main(String[] args) {
		int[] a = { 10, 20, 40, 45, 55 };
		int element = 55;
		int i = 0;
		while (i <= a.length -1 && a[i] < element) {
			i = (int) (Math.pow(2, i));
			break;
		}
		binarysearch.binarysearch(a, i, a.length , element);
	}

}
