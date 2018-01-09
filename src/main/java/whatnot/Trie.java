package whatnot;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    class TrieNode {

        Map<Character, TrieNode> children = new HashMap();
        boolean endOfWord;

        TrieNode() {
            children = new HashMap<>();
            endOfWord = false;

        }

    }

    private TrieNode trieNode = new TrieNode();

    public static void main(String[] args) {
        Trie trie = new Trie();
        String word = "abcd";
        trie.insert(word);
        System.out.println(trie.search("abc"));

    }

    private boolean search(String word) {
        TrieNode current = trieNode;
        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;

        }

        return current.endOfWord;
    }

    private void insert(String word) {
        TrieNode current = trieNode;
        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);

            }
            current = node;
        }
        current.endOfWord = true;
    }


}
