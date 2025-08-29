package DSA;

public class Trie {
	TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			int value = c - 'a';
			if (node.trieNodes[value] == null) {
				node.trieNodes[value] = new TrieNode();
			}
			node = node.trieNodes[value];
		}
		node.endWord = true;
	}

	public boolean search(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			int value = c - 'a';
			if (node.trieNodes[value] == null) {
				return false;
			}
			node = node.trieNodes[value];
		}
		return node.endWord;
	}

	public boolean startsWith(String prefix) {
		TrieNode node = root;
		for (char c : prefix.toCharArray()) {
			int value = c - 'a';
			if (node.trieNodes[value] == null) {
				return false;
			}
			node = node.trieNodes[value];
		}
		return true;
	}
}

class TrieNode {
	TrieNode[] trieNodes = new TrieNode[26];
	boolean endWord = false;
}
