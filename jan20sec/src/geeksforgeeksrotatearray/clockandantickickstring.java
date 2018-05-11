package geeksforgeeksrotatearray;

import java.util.Scanner;
//amazon interviews
//checkclockandanticlock 
// if another string present in first return true
public class clockandantickickstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(checkrotate(s, t));
	}

	public static Boolean checkrotate(String s, String t) {
		String b = s + s;
		for (int i = 1; i <= s.length(); i++) {
			String c = b.substring(i, i + s.length());
			if (t.equals(c))
				return true;
		}
		return false;
	}

}
