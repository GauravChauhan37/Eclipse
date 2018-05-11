package jan20sec;


public class ifelse {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 5;
		
		if (a >= b && a > c) {
			System.out.println("a is largest" + a);
		} else {
			if (b >= a && b >= c) {
				System.out.println("b is largest" + b);
			} else {
				System.out.println("C is largest" + c);
			}
		}
	}
}
