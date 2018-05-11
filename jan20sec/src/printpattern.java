import java.util.Scanner;

public class printpattern {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = a.nextInt();
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
