package observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Creates a new type of observer which observes the BestSellers class
 * 
 * @author Finlay Palmer
 */
public class FanReads implements Observer {
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    /**
     * Creates a new type of observer which observes the BestSellers class
     * 
     * @param subject   The Subject to be observed
     * @param firstName The first name of the author of the book
     * @param lastName  The last name of the author of the book
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        recommendations = new HashMap<Genre, ArrayList<Book>>();
        subject.registerObserver(this);
    }

    /**
     * Adds a new book to the recommendations HashMap
     * 
     * @param book The Book to add to recommendations
     */
    public void update(Book book) {
        ArrayList<Book> temp = new ArrayList<Book>();
        temp = recommendations.get(book.getGenre());
        if (temp == null) {
            temp = new ArrayList<Book>();
            recommendations.put(book.getGenre(), temp);
        }
        temp.add(book);
    }

    /**
     * Returns an Arraylist of books of a particular genre from recommendations
     * 
     * @param genre The genre of which to return the book
     * @return An Arraylist of books of the Genre genre
     */
    public ArrayList<Book> getRecommendations(Genre genre) {
        return recommendations.get(genre);
    }
}
