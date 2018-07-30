package GraphsRevise;

import java.util.HashMap;

import trie.Trie;

public class trie {
	static class Node {
		Character data;
		HashMap<Character, Node> hp = new HashMap<>();
		boolean eow;
	}

	private Node root;
	private int words;
	private int nodes;

	public trie() {
		this.root = new Node();
		this.words = 0;
		this.nodes = 1;
	}

	public boolean searchWord(String word, Node node) { // suffix tree
		if (word.length() == 0) {
			if (node.eow == true) {
				return true;
			} else {
				return false;
			}
		}
		char ch = word.charAt(0);
		word = word.substring(1);
		boolean ans = false;
		if (node.hp.containsKey(ch)) {
			ans = searchWord(word, node.hp.get(ch));
		} else {
			ans = false;
		}
		return ans;
	}

	public void addWord(String word) {

		for (int i = 0; i < word.length(); i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < word.length(); j++) {
				sb.append(word.charAt(j));
				addWord(sb.toString(), this.root);
			}
		}
	}

	private void addWord(String word, Node node) {
		if (word.length() == 0) {
			node.eow = true;
			return;
		}
		char ch = word.charAt(0);
		word = word.substring(1);
		Node child = node.hp.get(ch);
		if (child == null) {
			child = new Node();
			child.data = ch;
			node.hp.put(ch, child);
		}
		addWord(word, child);
	}

	public void removeWord(Node node, String word) {
		if (word.length() == 0) {
			node.eow = false;
			return;
		}
		char ch = word.charAt(0);
		word = word.substring(1);
		removeWord(node.hp.get(ch), word);
		if (node.hp.get(ch).hp.size() == 0 && node.hp.get(ch).eow == false) {
			node.hp.remove(ch);
		}
	}

	public static void main(String[] args) {
		trie t = new trie();
		t.addWord("sea");
//		t.addWord("as", t.root);
//		t.addWord("ask", t.root);
//		t.addWord("but", t.root);
//		t.addWord("see", t.root);
//		t.addWord("seen", t.root);
//		t.addWord("riv", t.root);
//		t.addWord("ase", t.root);
//		t.addWord("tea", t.root);
//		t.addWord("seas", t.root);
//		boolean ans = t.searchWord("as", t.root);
//		boolean ans1 = t.searchWord("ask", t.root);
//		System.out.println(ans + " " + ans1);
//		t.removeWord(t.root, "ask");
//		boolean ans2 = t.searchWord("as", t.root);
//		System.out.println(ans2);
		System.out.println(t.searchWord("s", t.root));
		System.out.println(t.searchWord("ea", t.root));
	}

}
