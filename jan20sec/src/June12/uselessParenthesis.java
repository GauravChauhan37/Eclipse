package June12;

import java.util.Stack;

public class uselessParenthesis {
	public void checkParenthesis1(String s) {
		dynamicStack st = new dynamicStack(10);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ')') {
				st.push((int) ch);
			} else if (ch == ')') {
				if (st.top() == '(') {
					System.out.println("UnBalanced");
					return;
				} else {
					while (st.top() != '(') {
						st.pop();
					}
					st.pop();
				}
			}
		}
		if (st.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("unBalanced");
		}
	}

	public static void main(String[] args) {
		String s = "(((a+b)+c))";
		uselessParenthesis u = new uselessParenthesis();
		u.checkParenthesis1(s);
	}
}
