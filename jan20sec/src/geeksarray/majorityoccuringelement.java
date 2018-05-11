package geeksarray;

public class majorityoccuringelement {

	public static void mef(int[] a) {
		int count = 0;
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count >= a.length / 2) {
				num = a[i];
			}
			count = 0;
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 3, 2, 3, 2, 3 };
		mef(a);
	}

}
