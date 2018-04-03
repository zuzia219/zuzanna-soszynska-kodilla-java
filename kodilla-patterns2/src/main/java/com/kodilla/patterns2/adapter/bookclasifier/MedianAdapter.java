package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends Statistics implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (Book bookA : bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookB = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            BookSignature bookSignature = new BookSignature(bookA.getSignature());
            books.put(bookSignature, bookB);
        }
        return medianPublicationYear(books);
    }
}
