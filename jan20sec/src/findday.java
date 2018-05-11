import java.util.Scanner;

public class findday {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the num of days");
		int noofdays = a.nextInt();
		System.out.println("enter the firstday");
		int firstday = a.nextInt();
		int nextmnth;
		int b = noofdays % 7;
		nextmnth = (firstday + noofdays) % 7;
		System.out.println("first of next mnth will be" + " " + nextmnth);
	}

}
