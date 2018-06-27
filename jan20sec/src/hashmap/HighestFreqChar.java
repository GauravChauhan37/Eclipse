package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class HighestFreqChar {

	public static void main(String[] args) {
		String s = "abcdasnascabaaaaancoasoi";
		highestFreq(s);
	}

	private static void highestFreq(String s) {
		HashMap<Character, Integer> hp = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hp.containsKey(ch)) {
				int val = hp.get(ch);
				val++;
				hp.put(ch, val);
			} else {
				hp.put(ch, 1);
			}
		}
		System.out.println(hp);
		ArrayList<Character> al = new ArrayList<>(hp.keySet());
		int max = Integer.MIN_VALUE;
		char ch = 0;
		for (int i = 0; i < al.size(); i++) {
			if (hp.get(al.get(i)) > max) {
				max = hp.get(al.get(i));
				ch = al.get(i);
			}
		}
		System.out.println(ch);
	}
}
