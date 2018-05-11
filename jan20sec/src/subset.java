
public class subset {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int i;
		int[] rem = new int[a.length];
		for (i = 0; i < (1 << a.length); i++) {
			int temp = i;
			for (int j = 0; j < a.length; j++) {
				int r = temp % 2;
				temp = temp / 2;
				rem[rem.length - 1 - j] = r;
			}
			for (int k = 0; k < rem.length; k++) {
				if (rem[k] == 1) {
					System.out.print(a[k] + " ");
				} else {
					System.out.print("_" + " ");
				}
			}
			System.out.println();
		}

	}

}
