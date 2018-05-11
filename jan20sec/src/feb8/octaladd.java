package feb8;

public class octaladd {

	public static void main(String[] args) {
		int power = 1;
		int first = 777;
		int scnd = 1;
		int num = 0;
		int carry = 0;
		int rem = 0;
		int rem2 = 0;
		int result = 0;
		int ans = 0;
		while (first != 0 || scnd != 0 || carry != 0) {
			rem = first % 10;
			rem2 = scnd % 10;
			result = carry + rem + rem2;

			num = result % 8;
			ans = ans + num * power;
			carry = result / 8;

			first = first / 10;
			scnd = scnd / 10;

			power = power * 10;
		}
		
		System.out.println(ans);
	}
}
