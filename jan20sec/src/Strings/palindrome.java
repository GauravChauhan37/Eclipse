package Strings;

public class palindrome {

	public static void main(String[] args) {
		String s = "nitin";
		int flag = 0;
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				flag = 1;
			} else {
				System.out.println("false");
				return;
			}
			i++;
			j--;
		}
		if (flag == 1) {
			System.out.println("true");
		}
	}

}
