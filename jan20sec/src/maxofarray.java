
public class maxofarray {

	public static void main(String[] args) {
		int[] a = { 11, 55, 9, 88, 17, 2 };
		int i;
		int max = a[0];
		{
			for (i = 1; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				} else {
					continue;
				}
			}
			System.out.print(max);
		}
	}
}
