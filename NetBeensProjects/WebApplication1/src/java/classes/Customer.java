/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author huser
 */
@Entity
@NamedQueries({
    @NamedQuery(name="customer.findById", query="from Customer c where c.id=:id"),
    @NamedQuery(name="customer.findByFirstName", query = "from Customer c where c.userName=:userName")
})
public class Customer {
    @Id
    private int id;
    private String userName;
    private String password;

    public Customer(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    public Customer() {
    }
    
   
}
