package edu.mills.cs180a;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBooks();

    Book createBook(Book book);

    Book updateBook(Book book);

    Book findBookById(Long id);

    void deleteBook(Long id);
}
