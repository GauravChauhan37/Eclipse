import java.util.Scanner;

public class rotatearray {

	public static void main(String[] args) {
		int[] a = { 1,2,3,4,5 };
		int p,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rotate");
		int rotate = sc.nextInt();
		int[] r = new int[rotate];
		for (p=0, i = a.length - rotate; i <  a.length; i++,p++) {
			r[p] = a[i];
		}
		for (int j = a.length-1-rotate; j>=0; j--) {
			// move
			a[j+rotate]=a[j];
		}
		for (int k = 0; k < rotate; k++) {
			// put other in begin
			a[k] = r[k];

		}
		for (int l = 0; l < a.length; l++) {
			// print
			System.out.print(a[l]+" ");
		}

	}

}
