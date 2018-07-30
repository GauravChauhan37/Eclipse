package GraphsRevise;

import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanEncoder {
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

	public HuffmanEncoder(String s) {
		HashMap<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			freq.put(s.charAt(i), freq.get(s.charAt(i)) == null ? 1 : freq.get(s.charAt(i)) + 1);
		}
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for (Character ch : freq.keySet()) {
			Node n = new Node();
			n.data = ch;
			n.freq = freq.get(ch);
			pq.add(n);
		}
		while (pq.size() != 1) {
			Node first = pq.remove();
			Node scnd = pq.remove();
			Node thrd = new Node();
			thrd.freq = first.freq + scnd.freq;
			thrd.left = first;
			thrd.right = scnd;
			pq.add(thrd);
		}
		Node root = pq.remove();
		traverse(root, "");
	}

	private void traverse(Node node, String s) {
		if (node.left == null && node.right == null) {
			enc.put(node.data, s);
			dec.put(s, node.data);
			return;
		}
		traverse(node.left, s + "0");
		traverse(node.right, s + "1");
	}

	public void encoder(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			ans += enc.get(s.charAt(i));
		}
		System.out.println(ans);
	}

	public void decoder(String s) {
		String ans = "";
		String ssf = "";
		for (int i = 0; i < s.length(); i++) {
			ssf += s.charAt(i);
			if (dec.containsKey(ssf)) {
				ans += dec.get(ssf);
				ssf = "";
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		HuffmanEncoder h = new HuffmanEncoder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbcccd");
		h.encoder("aaabcdaa");
		h.decoder("1110100100011");
	}
}
