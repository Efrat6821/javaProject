/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author huser
 */
@Entity
@DiscriminatorValue(value = "C")
public class Magazin extends Item{
    private String year_;

    public String getYear() {
        return year_;
    }

    public void setYear(String year) {
        this.year_ = year;
    }
    
    
}
