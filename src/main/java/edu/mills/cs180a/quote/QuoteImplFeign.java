package edu.mills.cs180a.quote;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class QuoteImplFeign {
    private static final String URI_QUOTE = "https://gturnquist-quoters.cfapps.io";

    public Quote getQuote() {
        QuoteResourceFeign quoteResource = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(QuoteResourceFeign.class, URI_QUOTE);
        return quoteResource.getQuote();
    }

    public static void main(String[] args) {
        QuoteImplFeign quoteImpl = new QuoteImplFeign();
        System.out.println(quoteImpl.getQuote());
    }
}
