package observer;

/**
 * Creates a new Book object
 * 
 * @author Finlay Palmer
 */
public class Book {
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    /**
     * Creates a new Book object
     * 
     * @param title           The title of the book
     * @param genre           The genre of the book
     * @param authorFirstName The first name of the author of the book
     * @param authorLastName  The last name of the author of the book
     * @param description     The summary of the book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    /**
     * Returns the title of the book
     * 
     * @return The title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the genre of the book
     * 
     * @return The genre of the book
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Returns the first name of the author of the book
     * 
     * @return The first name of the author of the book
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Returns the last name of the author of the book
     * 
     * @return The last name of the author of the book
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Returns the summary of the book
     * 
     * @return The summary of the book
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a string containing all the attributes of the book
     * 
     * @return The attributes of the book
     */
    public String toString() {
        return "\n" + "----- " + title + "-----\n" + genre.label + " by: " + authorFirstName + " " + authorLastName
                + "\n"
                + description;
    }
}
