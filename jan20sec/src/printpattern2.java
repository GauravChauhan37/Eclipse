import java.util.Scanner;

public class printpattern2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = a.nextInt();
		int i, j, num = 1;
		for (i = 0; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println(" ");
		}

	}

}
