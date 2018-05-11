package hackerrankprobs;

import java.util.Scanner;

public class noofdays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		int[] count = new int[7];
		while (testcases >= 0) {
			int nod = sc.nextInt();
			String firstday = sc.next();
			int[] ans = test(testcases, nod, firstday, count);
			for (int i = 0; i < count.length; i++) {
				System.out.print(count[i] + " ");
			}
			System.out.println();
			testcases--;
		}
	}

	public static int[] test(int testcases, int nod, String firstday, int[] count) {
		for (int i = 0; i < count.length; i++) {
			count[i] = 4;
		}
		// findfirstday
		int pos = 0;
		String[] days = new String[] { "mon", "tues", "wed", "thurs", "fri", "sat", "sun" };
		for (int i = 0; i < days.length; i++) {
			if (days[i].equals(firstday)) {
				pos = i;
				break;
			}
		}
		// increment the rest
		int left = nod - 28;
		while (left > 0) {
			count[pos]++;
			pos = (pos+1) %7;
			left--;
		}
		return count;
	}
	
}
