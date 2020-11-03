package edu.mills.cs180a.book;

import java.util.List;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class BookRepositoryImplFeign {
    private static final String URI_BOOK = "http://localhost:8080";
    BookResourceFeign bookResource = Feign.builder().encoder(new JacksonEncoder())
            .decoder(new JacksonDecoder()).target(BookResourceFeign.class, URI_BOOK);

    public Book updateBook(Book book) throws Exception {
        Book updatedBook = bookResource.updateBook(book.getId(), book);
        return updatedBook;
    }

    public Book createBook(Book book) throws Exception {
        Book createdBook = bookResource.createBook(book);
        return createdBook;
    }

    public List<Book> getAllBooks() throws Exception {
        return bookResource.getAllBooks();
    }

    public void deleteBook(Long id) {
        BookResourceFeign bookResource = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(BookResourceFeign.class, URI_BOOK);
        bookResource.deleteBook(id);
    }

    public Book findBookById(Long id) {
        return null;
    }

    public static void main(String[] args) throws Exception {
        BookRepositoryImplFeign bookRepository = new BookRepositoryImplFeign();
        Book book = bookRepository.getAllBooks().get(0);
        System.out.println(book);
        // bookRepository.deleteBook(book.getId());
    }
}
