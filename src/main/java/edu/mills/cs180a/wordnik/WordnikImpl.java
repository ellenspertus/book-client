package edu.mills.cs180a.wordnik;

import feign.Headers;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface WordnikImpl {
    @RequestLine("GET /words.json/wordOfTheDay")
    WordOfTheDay getWordOfTheDay();
}
