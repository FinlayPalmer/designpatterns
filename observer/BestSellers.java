package observer;

import java.util.ArrayList;

/**
 * Creates a new type of subject which contains a list of best sellers
 * 
 * @author Finlay Palmer
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Creates a new types of subject which contains a list of best sellers
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * Adds a new observer to the observers Arraylist
     * 
     * @param observer The observer to add to observers
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the observers Arraylist
     * 
     * @param observer The observer to remove from observers
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Updates all the observers about a particular book
     * 
     * @param book the book to update the observers about
     */
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * Adds a new book to the bestSellers Arraylist and notifies the observers about
     * it
     * 
     * @param title           The title of the book
     * @param genre           The genre of the book
     * @param authorFirstName The first name of the author of the book
     * @param authorLastName  The last name of the author of the book
     * @param description     The summary of the book
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book book = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(book);
        notifyObservers(book);

    }
}
