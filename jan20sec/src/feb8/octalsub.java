package feb8;

public class octalsub {

	public static void main(String[] args) {
		int first = 1000;
		int scnd = 1;
		int fans = 0;
		int power = 1;
		int carry = 0;

		while (first != 0 || scnd != 0) {
			int r1 = first % 10;
			first = first / 10;
			int r2 = scnd % 10;
			scnd = scnd / 10;
			int r = 0;
			if ((r1 + carry >= r2)) {
				r = r1 + carry - r2;
				carry = 0;
			} else {
				r = r1 + carry + 8 - r2;
				carry = -1;
			}
			fans = fans + r * power;
			power = power * 10;
System.out.println(fans);
		}

	}

}
