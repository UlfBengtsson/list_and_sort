package se.lexicon.skovde;

import se.lexicon.skovde.models.Employee;
import se.lexicon.skovde.models.MyList;
import se.lexicon.skovde.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Person> peopleList = new ArrayList();
        //List<Person> peopleList = new ArrayList();

        System.out.println("size: " + peopleList.size());

        peopleList.add(new Person("Ulf", "Öman"));
        peopleList.add(new Person("Ulf", "Åman"));
        peopleList.add(new Person("Ulf", "Bernadott"));
        peopleList.add(new Employee("Ulf", "Bengtsson", 9999999));
        peopleList.add(new Person("Ulf", "Andersson"));
        peopleList.add(new Person("Ulf", "andersson"));

        System.out.println("size: " + peopleList.size());

        Collections.sort(peopleList);

        Iterator<Person> peopleItr = peopleList.iterator();

        while (peopleItr.hasNext())
        {
            System.out.println(peopleItr.next().getLastName());
        }


        MyList<Person> myPeopleList = new MyList<>();

        myPeopleList.add(peopleList.get(0));
    }
}
