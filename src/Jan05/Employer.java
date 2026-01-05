/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JEE
 */
public class Employer {
    
    int id;
    String name;
    double capital;
    
    //Constructor
    public Employer(int id, String name, double capital){
        this.id = id;
        this.name = name;
        this.capital = capital;
    }
    
    // display method
    public void display() {
       System.out.println("ID: " + id + ", Name: " + name 
       + ", Capital: " + capital);
    }
    
    // Main method
    public static void main(String[] args) {
         Set<Employer> employers = new HashSet<>();
         
         employers.add(new Employer(1, "Rahim Group", 500000));
         employers.add(new Employer(2, "Karim Ltd", 750000));
         employers.add(new Employer(3, "Habib Enterprise", 600000));
         
         for (Employer e : employers){
             e.display();
         }
    } 
}
