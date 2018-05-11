package recursion;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class dice {

	public static void main(String[] args) {
		System.out.println(dc(0, 10));
		System.out.println();
		dcwithtree(0, 10, "");

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

	public static void dcwithtree(int src, int dest, String asf) {
		if (src == dest) {
			System.out.println(asf);
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			int intermediate = src + dice;
			if (src + dice <= dest) {
				dcwithtree(intermediate, dest, asf + dice);
			}
		}
	}
}
