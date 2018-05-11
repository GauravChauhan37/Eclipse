package recursion;

import java.util.ArrayList;

public class dicesubsequences {

	public static void main(String[] args) {
		int src = 0;
		int dest = 10;
		ArrayList<String> ss = getss(src, dest);
		System.out.println(ss);

	}

	public static ArrayList<String> getss(int src, int dest) {
		if (src == dest) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		ArrayList<String> stod = new ArrayList<String>();
		for (int dice = 1; dice <= 6; dice++) {
			int i = dice + src;
			if (i <= dest) {
				ArrayList<String> itod = getss(i, dest);
				for (String h : itod) {
					stod.add(dice + h);
				}
			}
		}

		return stod;
	}
}
