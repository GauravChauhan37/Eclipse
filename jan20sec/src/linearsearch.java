import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		int[] a = { 11, 22, 88, 9, 17, 2 };
		int i;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		for (i = 0; i < a.length; i++) {
			if (a[i] == data) {
				break;
			} else {
				continue;
			}

		}
		if (i == a.length) {
			System.out.println(-1);
		} else {
			System.out.println(i);
		}

	}
}
