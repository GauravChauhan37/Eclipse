package codingbat;

import java.util.Scanner;

// catcowcat
// cat
// expected output --> 9
public class countlargeststringbtwsubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String sn = sc.nextLine();
		System.out.println(large(s, sn));
	}

	static Boolean flag = false; // global variable

	public static int large(String s, String sc) {
		int c = 0;
		if (s.length() < 3) {
			return c;
		}
		String first = s.substring(0, 3);
		if (first.equals(sc)) {
			c += 3;
			flag = !flag;
			c = c + large(s.substring(3), sc);
		} else {
			if (flag == true) {
				c++;
			}
			c = c + large(s.substring(1), sc);
		}
		return c;
	}
}
