package com.ejb.businesslogic;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.business.LibraryPersistentBeanRemote;
import com.ejb.entities.Book;

@Stateless
public class LibraryPersistentBean implements LibraryPersistentBeanRemote {
    
   public LibraryPersistentBean() {
   }

   @PersistenceContext(unitName="EjbComponentPU")
   private EntityManager entityManager;         

   public void addBook(Book book) {
      entityManager.persist(book);
   }    

   public List<Book> getBooks() {
      return entityManager.createQuery("From Book").getResultList();
   }
}