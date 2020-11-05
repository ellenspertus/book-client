package edu.mills.cs180a.wordnik;

import java.util.List;
import java.util.stream.Collectors;

public class Definition {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String toString() {
        return text;
    }

    // https://stackoverflow.com/questions/31456898/convert-a-for-loop-to-concat-string-into-a-lambda-expression
    static String formatDefinitions(List<Definition> defs) {
        return (defs.stream().map(def -> def.toString()).collect(Collectors.joining("\n")));
    }

}
