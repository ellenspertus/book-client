package edu.mills.cs180a.wordnik;

import feign.Headers;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface WordnikResource {
    @RequestLine("GET /words.json/wordOfTheDay")
    WordOfTheDay getWordOfTheDay();
}
