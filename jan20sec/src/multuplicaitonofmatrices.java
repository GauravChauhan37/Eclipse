import java.util.Scanner;

public class multuplicaitonofmatrices {
	// multiplication
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		int[][] b = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int[][] product = new int[a.length][b[0].length];
		display(a);
		display(b);
		multi(a, b, product);
		display(product);
	}

	public static void display(int mat[][]) {
		for (int k = 0; k < mat.length; k++) {
			for (int p = 0; p < mat[0].length; p++) {
				System.out.print(mat[k][p] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void multi(int a[][], int b[][], int product[][]) {
		if (a[0].length != b.length) {
			System.out.println("invalid input");
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					int sum = 0;
					for (int p = 0; p < a[0].length; p++) {
						sum = sum + a[i][p] * b[p][j];
					}
					product[i][j] = sum;
				}
			}
		}
	}
}
