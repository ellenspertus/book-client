package edu.mills.cs180a.wordnik;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class WordnikImpl {
    private static final String URI_WORDNIK = "https://api.wordnik.com/v4";
    private final String apiKey;

    public WordnikImpl() throws IOException {
        try (InputStream is = Main.class.getClassLoader().getResourceAsStream("api-key.txt")) {
            apiKey = IOUtils.toString(is, StandardCharsets.UTF_8);
        }
    }

    public WordOfTheDay getWordOfTheDay() {
        WordnikResource wordnikResource = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(WordnikResource.class, URI_WORDNIK);
        return wordnikResource.getWordOfTheDay();
    }

    public static void main(String[] args) throws IOException {
        WordnikImpl wordnikImpl = new WordnikImpl();
        System.out.println(wordnikImpl.getWordOfTheDay());
    }
}
