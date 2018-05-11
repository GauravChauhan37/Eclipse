package practice;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class dice {

	public static void main(String[] args) {
		// System.out.println(dc(0, 10));
		// System.out.println();
		// dcwithtree(0, 10, "");
		int[] ladder = new int[16];
		ladder[2] = 13;
		ladder[3] = 11;
		ladder[5] = 7;
		dcwithladder(0, 15, "", ladder);
	}

	public static ArrayList<String> dc(int src, int dest) {
		if (src == dest) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		ArrayList<String> stod = new ArrayList<String>();
		for (int dice = 1; dice <= 6; dice++) {
			// intermediate
			if (dice + src <= dest) { // to ignore non required values
				ArrayList<String> itod = dc(src + dice, dest);
				for (String rstr : itod) {
					stod.add(dice + rstr);
				}
			}
		}
		return stod;
	}

	static int count = 0;

	public static void dcwithtree(int src, int dest, String asf) {
		if (src == dest) {
			++count;
			System.out.println(asf + " " + count);
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			if ((dice == 1 || dice == 6) && src == 0) {
				dcwithtree(1, dest, asf + 1);
			}
			if (src != 0) {
				int intermediate = src + dice;
				if (src + dice <= dest) {
					dcwithtree(intermediate, dest, asf + dice);
				}
			}
		}
	}

	public static void dcwithladder(int src, int dest, String asf, int[] ladder) {
		if (src == dest) {
			count++;
			System.out.println(asf + "   " + count);
			return;
		}
		if (src == 0) {
			dcwithladder(1, dest, asf + 1, ladder);
			dcwithladder(1, dest, asf + 6, ladder);
		} else if (ladder[src] != 0) {
			dcwithladder(ladder[src], dest, asf + "[" + src + "-->" + ladder[src] + "]", ladder);
		} else {
			for (int dice = 1; dice <= 6; dice++) {
				int intermediate = src + dice;
				if (src + dice <= dest) {
					dcwithladder(intermediate, dest, asf + dice, ladder);
				}
			}
		}
	}
}
