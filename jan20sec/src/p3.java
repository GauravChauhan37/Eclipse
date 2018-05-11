
public class p3 {

	public static void main(String[] args) {
		int val = 1;
		int n = 4, nst = 1, nsp = (2 * n) - 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nst; j++) {
				System.out.print(val);
				val++;
			}
			for (int k = 1; k <= nsp; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= nst; l++) {
				val--;
				if((l==1) && (i == n)){
					continue;
				}
				System.out.print(val);
			}
			nst += 1;
			nsp -= 2;
			System.out.println();
		}

	}

}
