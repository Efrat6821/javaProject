/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //addClient(2, "yael", "choen");

      //  findClientById(1);
         Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction trc = session.beginTransaction();
//         Book b= new Book();
//         b.setId(1);
//         b.setName("cook!");
//         b.setCategory(Category.COOKING);
//         session.save(b);
//         Magazin m= new Magazin();
//         m.setId(2);
//         m.setName("bbb");
//         m.setYear("2024");
//         session.save(m);
//         trc.commit();
//         //queries
//         session.getNamedQuery("customer.findById").setParameter("id", 1).list().stream().map(x-> ((Customer)x).getFirstName()).forEach(System.out::println);
//         session.getNamedQuery("book.findById").setParameter("id", 1).list().stream().forEach(System.out::println);
//         session.close();
// Session session= HibernateUtil.getSessionFactory().openSession();
//        Transaction trc = session.beginTransaction();
        Customer c=new Customer(10, "avi", "a6595");
        Borrow b = new Borrow(1,c,12,new Date(2020,1,1) );
        session.save(b);
        trc.commit();   
//        session.getNamedQuery("borrow.findById").setParameters(["customer", "book"], [c, 12]).list().stream().map(x-> ((Borrow)x).getBorrowId()).forEach(System.out::println);
//Borrow b = new Borrow();
//b.setBook(5);
//b.setCustomerId(new Customer(1, "gfg", "gfhgf"));
//         session.save(b);
//         trc.commit();
    }
    
}
