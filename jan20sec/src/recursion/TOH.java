package recursion;

public class TOH {

	public static void main(String[] args) {
		to("a", "b", "c", 3);

	}

	public static void to(String source, String dest, String aux, int n) {
		if (n == 0) {
			return;
		}
		to(source, aux, dest, n - 1);
		System.out.println(n + " " + source + " to" + " " + dest);
		to(aux, dest, source, n - 1);

	}

}
