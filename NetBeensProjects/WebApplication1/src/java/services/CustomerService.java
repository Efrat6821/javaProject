/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import classes.Borrow;
import classes.Customer;
import classes.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class CustomerService {
    public static int counter;
    public int addClient( String userName, String password){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction trc = session.beginTransaction();
        Customer c = new Customer(counter++, userName, password);
        session.save(c);
        trc.commit();
         return c.getId();
    }
    
    public Customer findClientById(int id){
         Session session= HibernateUtil.getSessionFactory().openSession();
         Transaction trc = session.beginTransaction();
         Customer c=(Customer) session.get(Customer.class, id);
         System.out.println("customer: "+c.getUserName());  
         return c;
    }
    
     public boolean inValid (String userName,String password){
         if(userName.length()<3 || password.length()<5)
             return false;
        return true;
    }

}
