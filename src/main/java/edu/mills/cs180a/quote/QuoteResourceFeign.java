package edu.mills.cs180a.quote;

import feign.Headers;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface QuoteResourceFeign {
    @RequestLine("GET /api/random")
    Quote getQuote();
}
