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
@DiscriminatorValue(value = "magazin")
public class Magazin extends Item{

    private int year;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Magazin(int id, int year, int idMagazin, String name) {
        super(id, name);
//        this.id = idMagazin;
        this.year = year;
    }

    public Magazin() {
    }

    @Override
    public String toString() {
        return "Magazin{" + "id=" + getId()+ ", year=" + year + '}';
    }
    

  
    
    
}
