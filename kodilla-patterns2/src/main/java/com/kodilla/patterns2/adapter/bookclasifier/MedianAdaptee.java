package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int avaragePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.avaragePublicationYear(books);
    }

    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
