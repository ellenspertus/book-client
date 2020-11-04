package edu.mills.cs180a.wordnik;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface WordnikResource {
    @RequestLine("GET /words.json/wordOfTheDay?api_key={apiKey}")
    WordOfTheDay getWordOfTheDay(@Param("apiKey") String apiKey);
}
