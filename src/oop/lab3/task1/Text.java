package oop.lab3.task1;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public int getNumberOfSentences() {
        return text.split("([a-z]*)([.?!])([\\s+])").length;
    }

    public int getNumberOfWords() {
        return text.split(" ").length;
    }
}