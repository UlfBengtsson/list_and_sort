package se.lexicon.skovde.models;

public class Employee extends Person {

    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }


}
