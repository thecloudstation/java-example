package com.cloudstation.javaexample.service;

import com.cloudstation.javaexample.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBook(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public Book addBook(Book book) {
        book.setId(counter.incrementAndGet());
        books.add(book);
        return book;
    }

    public Book updateBook(Long id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                book.setId(id);
                books.set(i, book);
                return book;
            }
        }
        return null;
    }

    public boolean deleteBook(Long id) {
        return books.removeIf(book -> book.getId().equals(id));
    }
}