package scrabble;

import scrabble.data.SimpleWordList;

import java.util.Scanner;

public class ScrabbleCheater {
    public static void main(String[] args) {
        SimpleWordList wordList = new SimpleWordList();
        wordList.initFromFile("C:\\Users\\falfa\\Documents\\Uni\\2.Semester\\Info 2\\Übungen\\ScrabbleCheater-main\\src\\scrabble\\data\\dictionary.txt");  // The fileName parameter is not used in this implementation.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a tile rack: ");
        String tileRack = scanner.nextLine();

        System.out.println("Valid words using all tiles: ");
        wordList.validWordsUsingAllTiles(tileRack).forEach(System.out::println);
    }
}
