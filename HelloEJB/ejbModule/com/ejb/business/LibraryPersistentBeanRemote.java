package com.ejb.business;

import java.util.List;
import javax.ejb.Remote;

import com.ejb.entities.Book;

@Remote
public interface LibraryPersistentBeanRemote {

   void addBook(Book bookName);

   List<Book> getBooks();
    
}
