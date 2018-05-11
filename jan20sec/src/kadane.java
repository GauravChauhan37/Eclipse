
public class kadane {

	public static void main(String[] args) {
		int[] a = { 5, -8, 2, 7, 12, 3, -25, 15, 7, 3 };
		int cmax = a[0];int cep=0,csp=0;
		int omax = a[0];int oep=0,osp=0;
		for (int i = 1; i <= a.length - 1; i++) {
			if (a[i] + cmax > a[i]) {
				cmax = a[i] + cmax;
				cep=i;
			} else {
				cmax = a[i];
				csp=i;
				cep=i;
			}

			if (cmax > omax) {
				omax = cmax;
				osp=csp;
				oep=cep;
				
			}
		}
		System.out.println(omax+" "+osp+" "+oep);
	}
}
