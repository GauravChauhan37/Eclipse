package geeks4geeksbacktracking;

import java.util.ArrayList;
import java.util.Stack;

public class invalidparenthesis {
	static ArrayList<String> al = new ArrayList<String>();

	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		int top = st.size();
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) == '(' || s.charAt(i) == ')')) {
				continue;
			} else if (s.charAt(i) == '(') {
				st.push(s.charAt(i));
				top++;
			} else if (s.charAt(i) == ')' && top != 0) {
				st.pop();
				top--;
			} else if (s.charAt(i) == ')' && top == 0) {
				return false;
			}
		}
		return true;
	}

	public static void removeparth(String s) {
		if (s.length() == 1) {
			return;
		}
		if (isValid(s)) {
			boolean flag = false;
			for (int i = 0; i < al.size(); i++) {
				String res = al.get(i);
				if (res.equals(s)) {
					flag = true;
				}
			}
			if (flag == false) {
				al.add(s);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			String left = s.substring(0, i);
			String right = s.substring(i + 1);
			removeparth(left + right);
		}
		return;
	}

	public static void main(String[] args) {
		String s = "()())()";
		removeparth(s);
		int max = 0;
		for (int i = 1; i < al.size(); i++) {
			String res = al.get(i);
			if (res.length() > max) {
				max = res.length();
			}
		}
		for (int i = 0; i < al.size(); i++) {
			String res = al.get(i);
			if (res.length() == max)
				System.out.println(res);
		}
	}
}
