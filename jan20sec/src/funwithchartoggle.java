import java.util.Scanner;

public class funwithchartoggle {

	public static void main(String[] args) {
		char lc, uc;
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if ((ch >= 'a') && ch <= 'z') {
			uc = (char) ((ch - 'a') + 'A');
			System.out.println(uc);
		} else if ((ch >= 'A') && (ch <= 'Z')) {
			lc = (char) ((ch - 'A') + 'a');
			System.out.println(lc);
		} else {
			System.out.println("invalid");
		}
	}

}
