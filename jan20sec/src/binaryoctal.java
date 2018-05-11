
import java.util.Scanner;

public class binaryoctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sn;
		int sb;
		int db;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		sn = sc.nextInt();
		System.out.println("enter base of number");
		sb = sc.nextInt();
		System.out.println("Enter destination base");
		db = sc.nextInt();
		anyToany(sn, sb, db);

	}

	public static void anyToany(int sn, int sb, int db) {
		// step 1 ---> converting to base 10
		int mult = 1;
		int b10n = 0;
		int dn = 0;
		while (sn > 0) {
			int rem = sn % 10;
			b10n = b10n + rem * mult;
			mult *= sb;
			sn /= 10;
		}
		// System.out.println(b10n);
		// step 2----> coverting to any base=>9
		int dbm = 1;
		while (b10n > 0) {
			int rem = b10n % db;
			dn = dn + rem * dbm;
			dbm *= 10;
			b10n /= db;

		}
		System.out.println("no in destination base -->" + dn);

	}
}