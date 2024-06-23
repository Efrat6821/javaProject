/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author huser
 */
@Entity
@NamedQueries({
    @NamedQuery(name="borrow.findById", query="from Borrow b where b.customerId=:customer && b.book=:book")
})
public class Borrow {
    @Id
    private int borrowId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customerId",referencedColumnName="id")
    private Customer customerId;
    private int book;
    private Date borrowDate; 

    public Borrow() {
    }

    public Borrow(int borrowId, Customer customerId, int book, Date borrowDate) {
        this.borrowId = borrowId;
        this.customerId = customerId;
        this.book = book;
        this.borrowDate = borrowDate;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }
    
}
