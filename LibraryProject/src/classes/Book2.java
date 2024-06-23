/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.persistence.*;

/**
 *
 * @author huser
 */

@Entity
@DiscriminatorValue(value = "book")
public class Book2 extends Item{
    
  
    private Category category;

  
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book2(int id, Category category, int idBook, String name) {
        super(id, name);
        
        this.category = category;
    }

    public Book2() {
    }

    @Override
    public String toString() {
        return "Book2{" + "id=" + getId() + ", category=" + category + '}';
    }


    
}
