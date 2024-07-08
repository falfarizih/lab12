package scrabble.data;

import scrabble.util.Permutation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleWordList implements WordList {
    private Set<String> words = new HashSet<>();

    @Override
    public Set<String> validWordsUsingAllTiles(String tileRack) {
        Set<String> validWords = new HashSet<>();
        Permutation rackPermutation = new Permutation(tileRack);

        for (String word : words) {
            if (word.length() == tileRack.length() && new Permutation(word).equals(rackPermutation)) {
                validWords.add(word);
            }
        }
        return validWords;
    }

    @Override
    public Set<String> allValidWords(String tileRack) {
        return null;
    }

    @Override
    public boolean add(String word) {
        boolean result = words.add(word);
        return result;
    }

    @Override
    public boolean addAll(Collection<String> words) {
        return this.words.addAll(words);
    }

    @Override
    public int size() {
        return words.size();
    }

    @Override
    public WordList initFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;

    }
}
