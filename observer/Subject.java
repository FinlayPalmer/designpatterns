package observer;

/**
 * Creates a new Subject to be observed
 * 
 * @author Finlay Palmer
 */
public interface Subject {
    /**
     * Adds a new observer to the observers Arraylist
     * 
     * @param observer The observer to add to observers
     */
    public void registerObserver(Observer observer);

    /**
     * Removes an observer from the observers Arraylist
     * 
     * @param observer The observer to remove from observers
     */
    public void removeObserver(Observer observer);

    /**
     * Updates all the observers about a particular book
     * 
     * @param book the book to update the observers about
     */
    public void notifyObservers(Book book);
}