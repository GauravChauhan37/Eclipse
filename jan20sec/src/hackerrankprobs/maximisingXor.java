package hackerrankprobs;

public class maximisingXor {
	static int maximizingXor(int l, int r) {
		int xor = l ^ r;
		int count = 0;
		while (xor > 0) {
			count++;
			xor >>= 1;
		}
		int max = 0;
		int val = 1;
		while (count > 0) {
			max += val;
			val <<= 1;
			count--;
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println(maximizingXor(10, 15));
	}
}
