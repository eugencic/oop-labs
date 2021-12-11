package oop.lab3.task3;

public class Word {
    private String word;
    private int num;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Word) {
            Word w2 = (Word) obj;
            return this.word.toLowerCase().equals(w2.getWord().toLowerCase());
        }
        else {
            return false;
        }
    }
}
