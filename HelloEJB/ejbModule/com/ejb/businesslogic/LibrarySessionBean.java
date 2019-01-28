package com.ejb.businesslogic;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import com.ejb.business.LibrarySessionBeanRemote;
 
@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote {
    
   List<String> bookShelf;    
 
   public LibrarySessionBean() {
      bookShelf = new ArrayList<String>();
   }
 
   public void addBook(String bookName) {
      bookShelf.add(bookName);
   }    
 
   public List<String> getBooks() {
      return bookShelf;
   }
}