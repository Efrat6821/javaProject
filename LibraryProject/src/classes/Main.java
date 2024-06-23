/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.hibernate.*;

/**
 *
 * @author huser
 */
public class Main {

    public static Book getById(int id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Book b = (Book) s.get(Book.class, id);
        return b;
    }

    public static void useQuries() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.getNamedQuery("bookQuery").setParameter("id", 2).list().stream().forEach(System.out::println);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        Book book = new Book(1, "צוואה", 120.5);
        //        Book book2 = new Book(2, "דם קר", 80.0);
        //        Book book3 = new Book(3, "אל תסתר", 79.5);
        //
        //        Session s = HibernateUtil.getSessionFactory().openSession();
        //        Transaction t = s.beginTransaction();
        //        s.save(book);
        //        s.save(book2);
        //        s.save(book3);
        //        t.commit();
        //        Book b = getById(1);
        //        System.out.println(b);

//                Book2 b = new Book2(1, Category.ADULT, 5, "mmmm");
//                Book2 b2 = new Book2(2, Category.BAYAY, 5, "bbb");
//        
//                Magazin m = new Magazin(1, 2023, 600, "gtrhg");
//                Magazin m2 = new Magazin(2, 2023, 600, "hdsf");
//        
//                Session s = HibernateUtil.getSessionFactory().openSession();
//                Transaction t = s.beginTransaction();
//                s.save(b);
//                s.save(b2);
//                s.save(m);
//                s.save(m2);
//                t.commit();
        useQuries();
    }

}

