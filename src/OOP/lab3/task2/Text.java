package OOP.lab3.task2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public int getNumberOfLetters() {
        String regex = "\\w";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    public int getNumberOfVowels() {
        String regex = "[aeiou]"; // Vowels without Y and W
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    public int getNumberOfConsonants() {
        String regex = "([^aeiou\\W])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }
}
