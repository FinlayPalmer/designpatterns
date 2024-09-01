package observer;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

/**
 * Creates a new type of observer which observes the BestSellers class
 * 
 * @author Finlay Palmer
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Creates a new type of observer which observes the BestSellers class
     * 
     * @param subject The Subject to be observed
     */
    public Store(Subject subject) {
        this.subject = subject;
        bestSellers = new LinkedList<Book>();
        this.subject.registerObserver(this);
    }

    /**
     * Adds a new book to the bestSellers Queue and keeps the queue less than six
     * books long
     * 
     * @param book The book to add to the bestSellers Queue
     */
    public void update(Book book) {
        if (bestSellers.size() < 5) {
            bestSellers.add(book);
        } else {
            bestSellers.poll();
            bestSellers.add(book);
        }
    }

    /**
     * Returns a List of the bestSellers
     * 
     * @return The bestSellers list
     */
    public List<Book> getBestSellers() {
        return (List) bestSellers;
    }
}
