package strategy;

import java.util.List;

/**
 * Specifies the required methods for a class which searches for a person in a
 * list of People
 */
public interface SearchBehavior {
    /**
     * Finds out if person is in the list people
     * 
     * @param people The list of Attendees
     * @param person The Person who could be within the list of Attendees
     * @return true if people contains person, false if people does not contain
     *         person
     */
    public boolean contains(List<Person> people, Person person);
}
