package se.lexicon.skovde.models;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class Person implements Comparable<Person> {
    private static int idCounter = 1;
    private int id;

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName)
    {
        id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        if (lastName.equalsIgnoreCase(o.getLastName()))
        {
            return 0;//lika
        } else if (lastName.toUpperCase().charAt(0) < o.getLastName().toUpperCase().charAt(0))
        {
            return -1;//före
        }
        else {
            return 1;//efter
        }

        //return lastName.compareTo(o.getLastName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getId() != person.getId()) return false;
        if (getAge() != person.getAge()) return false;
        if (getFirstName() != null ? !getFirstName().equals(person.getFirstName()) : person.getFirstName() != null)
            return false;
        return getLastName() != null ? getLastName().equals(person.getLastName()) : person.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }


}
