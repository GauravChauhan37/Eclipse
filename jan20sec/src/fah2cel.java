
public class fah2cel {
	public static void main(String[] args) {
		int minf = 0;
		int maxf = 300;
		int jump = 20;
		int cel;
		for (int i = minf; i <= maxf; i += jump) {
			cel = (int) (5.0 / 9 * (i - 32)); 
			System.out.println(i + " " + cel);
		}

	}

}
