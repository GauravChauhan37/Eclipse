package trie;

public class client {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.addWord("sea");
		t.addWord("as");
		t.addWord("ask");
		t.addWord("but");
		t.addWord("see");
		t.addWord("seen");
		t.addWord("riv");
		t.addWord("tea");
		t.searchWord("as");
		t.searchWord("ask");
		System.out.println("************************");
		t.displayAllWords();
		System.out.println("****************************");
		t.displayTrie();
		System.out.println("********************");
		t.removeWord("ask");
		t.searchWord("as");
	}
}
