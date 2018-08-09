package recursion;

public class powerlogn {

	public static void main(String[] args) {
		System.out.println(pow(5, 16));
	}

	public static int pow(int n, int pow) {
		int tn;
		if(pow % 2 == 0) {
			return n;
		}
		if (pow % 2 == 0) {
			tn = n * pow(n, pow / 2);
		} else {
			tn = n * n * pow(n, pow / 2);
		}
		return tn;
	}
}