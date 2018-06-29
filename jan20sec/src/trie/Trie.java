package trie;

import java.util.ArrayList;
import java.util.HashMap;

public class Trie {
	static class Node {
		Character data;
		HashMap<Character, Node> hp = new HashMap<>();
		boolean eow;
	}

	private Node root;
	private int words;
	private int nodes;

	public Trie() {
		this.root = new Node();
		this.words = 0;
		this.nodes = 1;
	}

	public void searchWord(String s) {
		boolean ans = searchWord(s, this.root);
		System.out.println(ans);
	}

	private boolean searchWord(String patt, Node node) {
		if (patt.length() == 0) {
			return node.eow;
		}
		char ch = patt.charAt(0);
		patt = patt.substring(1);
		boolean ans;
		if (node.hp.containsKey(ch)) {
			ans = searchWord(patt, node.hp.get(ch));
			return ans;
		} else {
			return false;
		}
	}

	public void addWord(String s) {
		addWord(this.root, s);
	}

	private void addWord(Node node, String s) {
		if (s.length() == 0) {
			if (node.eow == false) {
				this.words++;
			}
			node.eow = true;
			return;
		}
		char ch = s.charAt(0);
		String ros = s.substring(1);
		Node child = node.hp.get(ch);
		if (child == null) {
			this.nodes++;
			child = new Node();
			child.data = ch;
			node.hp.put(ch, child);
		}
		addWord(child, ros);
	}

	public void displayAllWords() {
		displayAllWords(this.root, "");
	}

	private void displayAllWords(Node node, String str) {
		if (node.eow == true) {
			System.out.println(str); // cnnt return here cz it will not let
										// others get printed
		}
		ArrayList<Character> al = new ArrayList<>(node.hp.keySet());
		for (int i = 0; i < al.size(); i++) {
			char ch = al.get(i);
			displayAllWords(node.hp.get(ch), str + ch);
		}
	}

	public void displayTrie() {
		displayTrie(this.root);
	}

	private void displayTrie(Node node) {
		System.out.println(node.data + "--> " + node.hp.keySet());

		ArrayList<Character> al = new ArrayList<>(node.hp.keySet());
		for (int i = 0; i < al.size(); i++) {
			displayTrie(node.hp.get(al.get(i)));
		}
	}

	public void removeWord(String word) {
		removeWord(this.root, word);
	}

	private void removeWord(Node node, String word) {
		if (word.length() == 0) {
			if (node.eow == true) {
				this.words--;
			}
			node.eow = false;
			return;
		}
		char ch = word.charAt(0);
		word = word.substring(1);
		Node child = node.hp.get(ch);
		if (child == null) { // that word doesnt exists
			return;
		}
		removeWord(child, word);
		if (child.eow == false && child.hp.size() == 0) {
			node.hp.remove(ch);
			this.nodes--;
		}
	}
}
