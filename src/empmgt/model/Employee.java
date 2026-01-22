/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.model;

/**
 *
 * @author JEE
 */
public class Employee {
    
    private int id;
    private String fname;
    private String lname;
    private String desig;
    private String dept;
    private double salary;
    private int age;
    private String addr;  
    
    public Employee(int id, String fname, String lname, String desig, String dept, double salary, int age, String addr) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.desig = desig;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.addr = addr;
    }
    
    public Employee() {
    }
    
    
    
    
    
}
