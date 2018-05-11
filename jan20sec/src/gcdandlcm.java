import java.io.*;
import java.util.*;

public class gcdandlcm {

	public static void main(String[] args) {
		int rem = 1;
		int total = 1;
		Scanner sc = new Scanner(System.in);
		int firstnum = sc.nextInt();
		int scndnum = sc.nextInt();
		int div = firstnum;
		int dis = scndnum;
	  // lcm
		int lcm = (firstnum > scndnum) ? firstnum : scndnum;

		// Always true
		while (true) {
			if (lcm % firstnum == 0 && lcm % scndnum == 0) {
				break;
			}
			++lcm;
		}
		//gcd
		while (rem != 0) {
			rem = div % dis;
			if (rem == 0)
				break;
			div = dis;
			dis = rem;
		}
		System.out.println(dis + " " + lcm);
	}
}