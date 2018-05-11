package geeksforgeeksrotatearray;

public class rotateanddivby8 {
	public static void main(String[] args) {
		String s = "8";
		System.out.println("Rotations: " + countRotationsDivBy8(s));
	}

	public static int countRotationsDivBy8(String s) {
		int count = 0;
		if (s.length() == 1) {
			int first = s.charAt(0);
			if (first % 8 == 0)
				count++;
			return count;
		}
		if (s.length() == 2) {
			int second = s.charAt(1) * 10 + s.charAt(0);
			if (second % 8 == 0)
				count++;
			return count;
		}
		for (int i = 0; i < s.length() - 2; i++) {
			int third = s.charAt(i) * 100 + s.charAt(i + 1) * 10 + s.charAt(i + 2);
			if (third % 8 == 0)
				count++;
		}
		int third = s.charAt(s.length() - 2) * 100 + s.charAt(s.length() - 1) * 10 + s.charAt(0);
		if (third % 8 == 0)
			count++;
		return count;
	}
}
