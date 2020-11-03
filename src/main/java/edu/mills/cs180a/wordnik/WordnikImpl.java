package edu.mills.cs180a.wordnik;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class WordnikImpl {
    private static final String URI_WORDNIK = "https://api.wordnik.com/v4";

    public WordOfTheDay getWordOfTheDay() {
        WordnikResource wordnikResource = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(WordnikResource.class, URI_WORDNIK);
        return wordnikResource.getWordOfTheDay();
    }

    public static void main(String[] args) {
        WordnikImpl wordnikImpl = new WordnikImpl();
        System.out.println(wordnikImpl.getWordOfTheDay());
    }

}
