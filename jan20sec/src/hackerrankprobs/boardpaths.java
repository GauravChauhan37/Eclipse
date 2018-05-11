package hackerrankprobs;

import java.util.ArrayList;
import java.util.Scanner;

public class boardpaths {
	public static ArrayList<String> findpathsal(int src, int target, int dice) {
		if (src == target) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mresult = new ArrayList<>();
		for (int i = 1; i <= dice; i++) {
			int inter = src + i;
			if (inter <= target) {
				ArrayList<String> rresult = findpathsal(inter, target, dice);
				for (String rstr : rresult) {
					mresult.add(i+rstr);
				}
			}
		}
		return mresult;
	}

	public static void findpaths(int src, int target, int dice, String asf) {
		if (src == target) {
			System.out.println(asf);
			return;
		}
		for (int i = 1; i <= dice; i++) {
			int inter = src + i;
			if (inter <= target) {
				findpaths(inter, target, dice, asf + i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dice = sc.nextInt();
		ArrayList<String> ans = findpathsal(0, n, dice);
		System.out.println(ans.size());
		System.out.println(ans);
		findpaths(0, n, dice, "");
	}

}
