package observer;

/**
 * Creates a new Observer to observe a Subject
 * 
 * @author Finlay Palmer
 */
public interface Observer {
    /**
     * Adds a new book to observer's data structure
     * 
     * @param book The book to be added
     */
    public void update(Book book);
}
