import java.util.Scanner;

public class printpattern4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = a.nextInt();
		int i, j;
		for (i = 0; i <= n; i++) {
			int f=1;
			for (j = 0; j <= i; j++) {
				System.out.print(f+" ");
				f = (f * (i-j)/ (j+1));
			}
			System.out.println(" ");
		}

	}

}
