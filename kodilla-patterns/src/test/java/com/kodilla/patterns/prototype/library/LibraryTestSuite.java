package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws Exception {

        //Given
        Library library = new Library("School library");
        Book book1 = new Book("The unknown book", "Anonymous", LocalDate.of(1995, 12, 2));
        Book book2 = new Book("The unknown book", "Anonymous", LocalDate.of(1990, 12, 2));
        Book book3 = new Book("The unknown book", "Anonymous", LocalDate.of(1997, 12, 2));
        Book book4 = new Book("The unknown book", "Anonymous", LocalDate.of(1998, 12, 2));
        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book4);
        library.getBooks().add(book3);

        Library clonedLibrary = null;

        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("City library");

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Voivodeship library");


        library.getBooks().remove(book1);
        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
