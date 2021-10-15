package OOP.lab3.task1;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public int GetNumberOfSentences() {
        return text.split("([a-z]*)([.?!])([\\s+])").length;
    }

    public int GetNumberOfWords() {
        return text.split(" ").length;
    }
}