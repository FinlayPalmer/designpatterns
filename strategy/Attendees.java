package strategy;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Creates a new list of Attendees
 */
public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    /**
     * Creates a new Person
     * 
     * @param title The name of the list of Attendees
     */
    public Attendees(String title) {
        this.title = title;
        LinearSearch lSearch = new LinearSearch();
        setSearchBehavior(lSearch);
        people = new ArrayList<Person>();
    }

    /**
     * Adds a new Person to the people list if they are not already on it
     * 
     * @return null if they are already on the list, the Person if they are not on
     *         the list
     * 
     * @param firstName   First Name of Guest
     * 
     * @param lastName    Last Name of Guest
     * 
     * @param phoneNumber Phone Number of Guest
     * 
     * @param reminder    Special Note about Guest
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if (searchBehavior.contains(people, person)) {
            return null;
        } else {
            people.add(person);
            return person;
        }
    }

    /**
     * Gets the name of the list of Attendees
     * 
     * @return the name of the list of Attendees
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the Search Behavior to either Linear Search or Binary Search
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /**
     * Gets the list of Attendees
     * 
     * @return the list of Attendees
     */
    public List<Person> getList() {
        Collections.sort(people);
        return people;
    }
}
