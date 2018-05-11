package codingbat;

public class count11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 11, 23, 123, 11 };
		System.out.println(count(a, 0));
	}

	public static int count(int[] a, int n) {
		int c = 0; // if you declare a var inside a rec fun
		if (n == a.length) {
			return c;
		}
		c = count(a, n + 1); // then if you have to inc it , return vals inside
								// it only
		// if you take another var i.e. total it will not work cz
		// everytime c is initializing to 0 if not sen any other val
		if (a[n] == 11) {
			c++;
		}
		return c;
	}
}
