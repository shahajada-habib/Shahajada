package Jan05;

import java.util.ArrayList;
import java.util.List;

public class Person {

    int id;
    String name;
    double salary;

    // Constructor
    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Salary: " + salary);
    }

    // Main method
    public static void main(String[] args) {

        // Create List
        List<Person> persons = new ArrayList<>();

        // Add objects to list
        persons.add(new Person(1, "Rahim", 25000));
        persons.add(new Person(2, "Karim", 30000));
        persons.add(new Person(3, "Habib", 28000));

        // Display list elements
        for (Person p : persons) {
            p.display();
        }
    }
}
