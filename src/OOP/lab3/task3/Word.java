package OOP.lab3.task3;

public class Word {
    private String word;
    private int num;

    public Word(String word) {
        this.word = word;
    }

    public String GetWord() {
        return word;
    }

    public int GetNum() {
        return num;
    }

    public void SetNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Word) {
            Word w2 = (Word) obj;
            return this.word.toLowerCase().equals(w2.GetWord().toLowerCase());
        }
        else {
            return false;
        }
    }
}
