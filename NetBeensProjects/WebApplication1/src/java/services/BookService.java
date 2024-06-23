/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import classes.Book;
import classes.Category;
import classes.Customer;
import classes.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class BookService {
    public void addBook(int id,String name,Category category){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction trc = session.beginTransaction();
        Book b = new Book(Category.CHILDREN,12,"gil");
        session.save(b);
        trc.commit();
         
    }
    
    public void findBookById(int id){
         Session session= HibernateUtil.getSessionFactory().openSession();
         Transaction trc = session.beginTransaction();
         Book b=(Book) session.get(Book.class, id);
         System.out.println("customer: "+b.getName());   
    }
    
}
