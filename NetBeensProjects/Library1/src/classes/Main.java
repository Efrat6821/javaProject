/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class Main {

    public static void addClient(int id, String fn, String ln){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Customer c= new Customer(id, fn, ln);
        Transaction t= session.getTransaction();
        t.begin();
        session.save(c);
        t.commit();
         session.close();
    }
    
    public static void findClientById(int id){
         Session session= HibernateUtil.getSessionFactory().openSession();
         Transaction trc = session.beginTransaction();
         Customer c=(Customer) session.get(Customer.class, id);
         System.out.println("customer: "+c.getFirstName()+" "+c.getLastName());
        
         
         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //addClient(2, "yael", "choen");

      //  findClientById(1);
         Session session= HibernateUtil.getSessionFactory().openSession();
         Transaction trc = session.beginTransaction();
         Book b= new Book();
         b.setId(1);
         b.setName("cook!");
         b.setCategory(Category.COOKING);
         session.save(b);
         Magazin m= new Magazin();
         m.setId(2);
         m.setName("bbb");
         m.setYear("2024");
         session.save(m);
         trc.commit();
         //queries
         session.getNamedQuery("customer.findById").setParameter("id", 1).list().stream().map(x-> ((Customer)x).getFirstName()).forEach(System.out::println);
         session.getNamedQuery("book.findById").setParameter("id", 1).list().stream().forEach(System.out::println);
         session.close();
         
    }
    
}
