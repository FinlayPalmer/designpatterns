import java.util.ArrayList;

/**
 * Creates a new Character
 * 
 * @author Finlay Palmer
 */
public abstract class Character {
    private String name;
    protected ArrayList<String> lines;

    /**
     * Creates a new Character from an ArrayList<String> and a String
     * 
     * @param lines The ArrayList of Strings which represent the Character
     * @param name  The name of the Character
     */
    public Character(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    /**
     * Returns the name of the Character
     * 
     * @return The name of the Character
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a String to represent the character
     * 
     * @return The String which represents the character
     */
    public String toString() {
        String fullImage = "";
        fullImage = fullImage + "----- " + name + " -----\n";
        for (String line : lines) {
            fullImage = fullImage + line + "\n";
        }
        return fullImage;
    }
}
