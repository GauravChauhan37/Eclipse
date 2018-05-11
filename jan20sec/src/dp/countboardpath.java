package dp;

public class countboardpath {
	public static int countboardpath(int src, int dest, String asf, int[] qb) {
		if (src == dest) {
			return 1;
		}
		int ctod = 0;
		if (qb[src] != 0) {
			return qb[src];
		}
		for (int dice = 1; dice <= 6; dice++) {
			int intermediate = src + dice;
			if (src + dice <= dest) {
				ctod = ctod + countboardpath(intermediate, dest, asf + dice, qb);
			}
		}
		qb[src] = ctod;
		return ctod;
	}

	public static int cbpiterrative(int src, int dest) {
		int[] f = new int[dest + 1];
		f[dest] = 1;
		for (int i = dest - 1; i >= src; i--) {
			for (int dice = 1; dice <= 6; dice++) {
				if (i + dice < f.length) {
					f[i] += f[i + dice];
				}
			}
		}
		return f[0];
	}

	public static int cbpwithconstsize(int src, int dest) {
		int[] f = new int[6];
		f[0] = 1;
		f[1] = 1;
		for (int slidecount = 2; slidecount <= dest; slidecount++) {
			// int temp = f[0] + f[1] + f[2] + f[3] + f[4] + f[5];
			// f[5] = f[4];
			// f[4] = f[3];
			// f[3] = f[2];
			// f[2] = f[1];
			// f[1] = f[0];
			// f[0] = temp;
			int temp = f[0];
			for (int i = 5; i >= 1; i--) {
				temp = temp + f[i];
				f[i] = f[i - 1];
			}
			f[0] = temp;
		}
		return f[0];

	}

	public static void main(String[] args) {
		// System.out.println(countboardpath(0, 10, "", new int[11]));
		// System.out.println(cbpiterrative(0, 10));
		System.out.println(cbpwithconstsize(0, 10));
	}

}
