package June12;

public class balancedParenthesis {
	public void checkBal(String s) {
		stack st = new stack(10);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				st.push(ch);
			} else if (ch == ']' || ch == '}' || ch == ')') {
				if (ch == ']') {
					ch = '[';
				} else if (ch == '}') {
					ch = '{';
				} else if (ch == ')') {
					ch = '(';
				}
				if (st.isEmpty() || ch != st.top()) {
					System.out.println("unBalanced");
					return;
				} else {
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
		// TODO Auto-generated method stub
		balancedParenthesis b = new balancedParenthesis();
		String s = "{(a+b)+[a+b]}";
		b.checkBal(s);
	}

}
