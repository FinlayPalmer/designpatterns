package strategy;

import java.util.List;
import java.util.Collections;

/**
 * Utilizes a Binary Search to find out if person is in the list people
 */
public class BinarySearch implements SearchBehavior {

    /**
     * Utilizes the recursive class bSearch() to find out if person is in the list
     * people
     * 
     * @param people The list of Attendees
     * @param person The Person who could be within the list of Attendees
     * @return true if people contains person, false if people does not contain
     *         person
     */
    public boolean contains(List<Person> people, Person person) {
        Collections.sort(people);
        return bSearch(people, person, 0, people.size() - 1);
    }

    /**
     * Utilize a recursive Binary Search to find out if person is in the list people
     * 
     * @param people The list of Attendees
     * @param person The Person who could be within the list of Attendees
     * @param start  Where the Binary Search starts from everytime it is called
     * @param end    Where the Binary Search ends everytime it is called
     * @return true if people contains person, false if people does not contain
     *         person
     */
    private boolean bSearch(List<Person> people, Person person, int start, int end) {
        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (people.get(mid).equals(person)) {
            return true;
        } else if (people.get(mid).compareTo(person) == 1) {
            return bSearch(people, person, start, mid - 1);
        } else {
            return bSearch(people, person, mid + 1, end);
        }
    }

}
