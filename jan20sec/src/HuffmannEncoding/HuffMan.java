package HuffmannEncoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffMan {
	static class Node implements Comparable<Node> {
		char data;
		int freq;
		Node left;
		Node right;

		@Override
		public int compareTo(Node o) {
			return this.freq - o.freq;
		}

	}

	HashMap<Character, String> enc = new HashMap<>();
	HashMap<String, Character> dec = new HashMap<>();

	HuffMan(String feeder) {
		// freq map
		HashMap<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < feeder.length(); i++) {
			char ch = feeder.charAt(i);
			if (freq.containsKey(ch)) {
				int val = freq.get(ch);
				val++;
				freq.put(ch, val);
			} else {
				freq.put(ch, 1);
			}
		}
		// Nodes and pq
		PriorityQueue<Node> pq = new PriorityQueue<>();
		ArrayList<Character> keys = new ArrayList<>(freq.keySet());
		for (Character key : keys) {
			Node n = new Node();
			n.data = key;
			n.freq = freq.get(key);
			pq.add(n);
		}
		// removal from pq
		while (pq.size() != 1) {
			Node one = pq.remove();
			Node two = pq.remove();
			Node thrd = new Node();
			thrd.freq = one.freq + two.freq;
			thrd.left = one;
			thrd.right = two;
			pq.add(thrd);
		}
		// traverse call
		Node root = pq.remove();
		traverse(root, "");
	}

	private void traverse(Node node, String ssf) {
		if (node.left == null && node.right == null) {
			enc.put(node.data, ssf);
			dec.put(ssf, node.data);
			return;
		}
		traverse(node.left, ssf + "0");
		traverse(node.right, ssf + "1");
	}

	public void encoder(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			ans += enc.get(s.charAt(i));
		}
		System.out.println(ans);
	}

	public void decode(String s) {
		String ans = "";
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r += s.charAt(i);
			if (dec.containsKey(r)) {
				ans += dec.get(r);
				r ="";
			} 
		}
		System.out.println(ans);
	}
}
