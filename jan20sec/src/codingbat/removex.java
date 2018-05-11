package codingbat;

public class removex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xaxb";
		System.out.println(noX(s));
	}

	public static String noX(String str) {
		if (str.length() == 0) {
			return str;
		}
		String temp;
		if (str.charAt(0) == 'x') {
			temp = "";
		} else {
			temp = str.charAt(0) + "";
		}
		String rest = noX(str.substring(1));
		temp = temp + rest;
		return temp;
	}
}
