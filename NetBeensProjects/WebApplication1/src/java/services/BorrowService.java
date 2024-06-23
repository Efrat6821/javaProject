/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import classes.Book;
import classes.Borrow;
import classes.Category;
import classes.Customer;
import classes.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class BorrowService {
       public void addBorrow(int borrowId, Customer customerId, int book, Date borrowDate){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction trc = session.beginTransaction();
        Borrow b = new Borrow(1,new Customer(10, "avi", "a6595"),12,borrowDate );
        session.save(b);
        trc.commit();     
    }
       
       public void deleteBorrow(Customer customer){
           //מחיקת הBorrow
         Session session= HibernateUtil.getSessionFactory().openSession();
         Transaction trc = session.beginTransaction();
         int x=12;
         //מציאת ההשאלה לפי מזהה לקוח ומזהה ספר
         //Borrow b=(Borrow) session.get(Borrow.class, customer: customer, book: x);
         trc.commit();
        
       }
}
