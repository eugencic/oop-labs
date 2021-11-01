package OOP.lab3.task3;

import java.util.*;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    List<Word> wordList = new ArrayList<>();

    public void getTopFiveWords() {
        String regex = "\\W+";
        String[] words = text.split(regex);
        for (String word1:words) {
            Word newWord = new Word(word1);
            if (Collections.frequency(wordList, newWord) == 0) {
                wordList.add(newWord);
                int count = 0;
                for (String word2:words) {
                    if (word1.equals(word2)) {
                        count++;
                    }
                }

                newWord.setNum(count);
            }
        }

        Collections.sort(wordList, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if (o1.getNum() > o2.getNum()) {
                    return -1;
                }
                else if (o2.getNum() > o1.getNum()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < 5; i++) {
            System.out.println(wordList.get(i).getWord() + " - appears " + wordList.get(i).getNum() + " times.");
        }
    }

    public String getLongestWord() {
        String regex = "\\W+";
        String[] words = text.split(regex);
        String longest = "";
        for (String word:words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}