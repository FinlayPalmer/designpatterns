package strategy;

import java.util.List;

/**
 * Utilizes a Linear Search to find out if person is in the list people
 */
public class LinearSearch implements SearchBehavior {

    /**
     * Utilizes a Linear Search to find out if person is in the list people
     * 
     * @param people The list of Attendees
     * @param person The Person who could be within the list of Attendees
     * @return true if people contains person, false if people does not contain
     *         person
     */
    public boolean contains(List<Person> people, Person person) {
        for (int x = 0; x < people.size(); x++) {
            if (people.get(x).equals(person)) {
                return true;
            }
        }
        return false;
    }

}
