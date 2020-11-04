package edu.mills.cs180a.wordnik;

import java.util.List;

public class WordOfTheDay {
    private String word;
    private List<Definition> definitions;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    private List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public String toString() {
        if (definitions != null && !definitions.isEmpty()) {
            return word + " (" + definitions.get(0) + ")";
        } else {
            return word;
        }
    }
}
