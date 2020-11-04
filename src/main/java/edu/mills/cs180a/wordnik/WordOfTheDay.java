package edu.mills.cs180a.wordnik;

public class WordOfTheDay {
    private String word;

    public WordOfTheDay() {}

    public WordOfTheDay(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }
}
