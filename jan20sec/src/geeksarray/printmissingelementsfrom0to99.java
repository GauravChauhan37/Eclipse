package geeksarray;

public class printmissingelementsfrom0to99 {
	public static void findme(int[] a, boolean[] marker) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 100) {
				marker[a[i]] = true;
			}
		}
	}

	public static void main(String[] args) {

		int[] a = { 88, 105, 3, 2, 200, 0, 10 };
		boolean[] marker = new boolean[100];
		findme(a, marker);
		String asf = "";
		boolean flag = false;
		for (int i = 0; i < marker.length; i++) {
			if (marker[i] == false && flag == false) {
				asf = asf + i + " ";
				flag = true;
			} else if (marker[i] == true && flag == true) {
				flag = false;
				asf = asf + (i - 1) + " ";
				System.out.println(asf);
				asf = "";
				System.out.println();
			}
		}
		if (!(asf.equals(""))) {
			asf = asf + "99" + " ";
			System.out.println(asf);
		}
	}
}
