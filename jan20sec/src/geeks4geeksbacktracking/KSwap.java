package geeks4geeksbacktracking;

public class KSwap {
	static int max = Integer.MIN_VALUE;

	public static void findMin(char ch[], int k) {
		if (k == 0) {
			return;
		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				swap(ch, i, j);
				int temp = Integer.parseInt(String.valueOf(ch));
				if (max < temp) {
					max = temp;
				}
				findMin(ch, k - 1);
				swap(ch, j, i);
			}
		}
	}

	public static void swap(char ch[], int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	public static void main(String args[]) {
		String str = "129814999";
		int n = 2;
		findMin(str.toCharArray(), n);
		System.out.println(max + "");
	}
}
