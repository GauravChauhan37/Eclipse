import java.util.Scanner;

public class printpattern3 {

	public static void main(String[] args) {
		int prev = 0;
		int current = 1;
		int next = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = a.nextInt();
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(prev);
				next = prev + current;
				prev = current;
				current = next;

			}
			System.out.println(" ");

		}

	}

}
