package OOP.lab3.task3;

import java.util.*;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    List<Word> WordList = new ArrayList<>();

    public void TopFiveWords() {
        String regex = "\\W+";
        String[] words = text.split(regex);
        for (String word1:words) {
            Word NewWord = new Word(word1);
            if (Collections.frequency(WordList, NewWord) == 0) {
                WordList.add(NewWord);
                int count = 0;
                for (String word2:words) {
                    if (word1.equals(word2)) {
                        count++;
                    }
                }

                NewWord.SetNum(count);
            }
        }

        Collections.sort(WordList, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if (o1.GetNum() > o2.GetNum()) {
                    return -1;
                }
                else if (o2.GetNum() > o1.GetNum()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < 5; i++) {
            System.out.println(WordList.get(i).GetWord() + " - appears " + WordList.get(i).GetNum() + " times.");
        }
    }

    public String GetLongestWord() {
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