/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author huser
 */
@Entity
@DiscriminatorValue(value = "B")
@NamedQueries({
    @NamedQuery(name="book.findById", query="from Book b where b.id=:id")
})
public class Book extends Item{
    
     @Enumerated(EnumType.STRING)
    private Category category;

     
    
    public Category getCategory() {
        return category;
    }

    public Book(Category category, int id, String name) {
        super(id, name);
        this.category = category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" + "category=" + category + '}';
    }
    
     
}
