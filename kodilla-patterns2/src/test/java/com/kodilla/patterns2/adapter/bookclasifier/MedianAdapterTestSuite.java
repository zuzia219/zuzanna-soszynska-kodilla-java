package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianWithOddNumberOfElements (){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("test author", "test title", 2000, "1"));
        bookSet.add(new Book("test author", "test title", 2002, "2"));
        bookSet.add(new Book("test author", "test title", 1997, "3"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(median);
        //Then
        assertEquals(median, 2000);
    }

    @Test
    public void testPublicationYearMedianWithEvenNumberOfElements (){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("test author", "test title", 2000, "1"));
        bookSet.add(new Book("test author", "test title", 2002, "2"));
        bookSet.add(new Book("test author", "test title", 1997, "3"));
        bookSet.add(new Book("test author", "test title", 2001, "4"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        assertEquals(median, 2001);
    }
}
